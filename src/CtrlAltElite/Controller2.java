package CtrlAltElite;
import java.util.ArrayList;

import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataFloat;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller2 {
	
	public static void main(String[] args) {
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Controller2";
		pn.SetName("Controller2");
		pn.NetworkPort = 1082;
		
		DataString ini = new DataString();
		//ini.Printable = false;
		ini.SetName("ini");
		ini.SetValue("red");
		pn.ConstantPlaceList.add(ini);
		
		DataString red = new DataString();
		//red.Printable = false;
		red.SetName("red");
		red.SetValue("red");
		pn.ConstantPlaceList.add(red);
		
		DataString green = new DataString();
		//green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.ConstantPlaceList.add(green);
		
		DataString yellow = new DataString();
		//yellow.Printable = false;
		yellow.SetName("yellow");
		yellow.SetValue("yellow");
		pn.ConstantPlaceList.add(yellow);
		
		DataString p1 = new DataString();
		p1.SetName("r1r2r3r4");
		p1.SetValue("signal");
		pn.PlaceList.add(p1);
		
		DataString p2 = new DataString();
		p2.SetName("g1r2r3r4");
		pn.PlaceList.add(p2);
		
		DataString p3 = new DataString();
		p3.SetName("y1r2r3r4");
		pn.PlaceList.add(p3);
		
		DataString p4 = new DataString();
		p4.SetName("r1g2r3r4");
		pn.PlaceList.add(p4);
		
		DataString p5 = new DataString();
		p5.SetName("r1y2r3r4");
		pn.PlaceList.add(p5);
		
		DataString p6 = new DataString();
		p6.SetName("r1r2g3r4");
		pn.PlaceList.add(p6);
		
		DataString p7 = new DataString();
		p7.SetName("r1r2y3r4");
		pn.PlaceList.add(p7);
		
		DataString p8 = new DataString();
		p8.SetName("r1r2r3g4");
		pn.PlaceList.add(p8);
		
		DataString p9 = new DataString();
		p9.SetName("r1r2r3y4");
		pn.PlaceList.add(p9);
		
		DataTransfer p10 = new DataTransfer();
		p10.SetName("OP15");
		p10.Value = new TransferOperation("localhost", "1080" , "P2_TL1");
		pn.PlaceList.add(p10);
		
		DataTransfer p11 = new DataTransfer();
		p11.SetName("OP17");
		p11.Value = new TransferOperation("localhost", "1080" , "P2_TL2");
		pn.PlaceList.add(p11);
		
		DataTransfer p12 = new DataTransfer();
		p12.SetName("OP19");
		p12.Value = new TransferOperation("localhost", "1080" , "P2_TL3");
		pn.PlaceList.add(p12);
		
		DataTransfer p13 = new DataTransfer();
		p13.SetName("OP9");
		p13.Value = new TransferOperation("localhost", "1080" , "P2_TL4");
		pn.PlaceList.add(p13);
		
		DataFloat counter = new DataFloat();
		counter.SetName("counter");
		counter.SetValue(2.0f);
		pn.ConstantPlaceList.add(counter);
		
		DataFloat counter2 = new DataFloat();
		counter2.SetName("counter2");
		counter2.SetValue(2.0f);
		pn.ConstantPlaceList.add(counter2);
		
		DataFloat counter3 = new DataFloat();
		counter3.SetName("counter3");
		counter3.SetValue(1.0f);
		pn.ConstantPlaceList.add(counter3);
		
		DataFloat counter4 = new DataFloat();
		counter4.SetName("counter4");
		counter4.SetValue(3.0f);
		pn.ConstantPlaceList.add(counter4);
		
		DataFloat initialValue = new DataFloat();
		initialValue.SetName("initialValue");
		initialValue.SetValue(3.0f);
		pn.ConstantPlaceList.add(initialValue);
		
		DataFloat subConstantValue1 = new DataFloat();
		subConstantValue1.SetName("subConstantValue1");
		subConstantValue1.SetValue(1.0f);
		pn.ConstantPlaceList.add(subConstantValue1);
		
		DataFloat subConstantValue0 = new DataFloat();
		subConstantValue0.SetName("subConstantValue0");
		subConstantValue0.SetValue(0.0f);
		pn.ConstantPlaceList.add(subConstantValue0);
		
		DataString in2_1 = new DataString();
		in2_1.SetName("in2_1");
		pn.PlaceList.add(in2_1);
		
		DataString plusTL1 = new DataString();
		plusTL1.SetName("plusTL1");
		pn.PlaceList.add(plusTL1);
		
		DataString in2_2 = new DataString();
		in2_2.SetName("in2_2");
		pn.PlaceList.add(in2_2);
		
		DataString plusTL2 = new DataString();
		plusTL2.SetName("plusTL2");
		pn.PlaceList.add(plusTL2);
		
		DataString in2_3 = new DataString();
		in2_3.SetName("in2_3");
		pn.PlaceList.add(in2_3);
		
		DataString plusTL3 = new DataString();
		plusTL3.SetName("plusTL3");
		pn.PlaceList.add(plusTL3);
		
		DataString in2_4 = new DataString();
		in2_4.SetName("in2_4");
		pn.PlaceList.add(in2_4);
		
		DataString plusTL4 = new DataString();
		plusTL4.SetName("plusTL4");
		pn.PlaceList.add(plusTL4);
		
		//----------------------------iniT------------------------------------
		PetriTransition iniT = new PetriTransition(pn);
		iniT.TransitionName = "iniT";
		
		Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

		GuardMapping grdiniT = new GuardMapping();
		grdiniT.condition= iniTCt1;
		
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP15"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP17"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP19"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP9"));
		grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));
		
		iniT.GuardMappingList.add(grdiniT);
	
		iniT.Delay = 0;
		pn.Transitions.add(iniT);
		
		//----------------------------T1------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T1";
		t1.InputPlaceName.add("r1r2r3r4");
		
		
		Condition T1Ct1 = new Condition(t1, "r1r2r3r4", TransitionCondition.NotNull);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "r1r2r3r4", TransitionOperation.Move, "g1r2r3r4"));
		grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "OP15"));
		t1.GuardMappingList.add(grdT1);
	
		t1.Delay = 5;
		pn.Transitions.add(t1);
		
		//----------------------------T2------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T2";
		t2.InputPlaceName.add("g1r2r3r4");
		
		
		Condition T2Ct1 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
		Condition T2Ct2 = new Condition(t2, "in2_1", TransitionCondition.IsNull);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition= T2Ct1;
		grdT2.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
		grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP15"));
		grdT2.Activations.add(new Activation(t2, "counter", TransitionOperation.Move, "counter"));
		
		t2.GuardMappingList.add(grdT2);
		
		Condition T2Ct1_2 = new Condition(t2, "in2_1", TransitionCondition.NotNull);
		Condition T2Ct2_2 = new Condition(t2, "counter", TransitionCondition.MoreThan,"subConstantValue0");
		Condition T2Ct3_2 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
		T2Ct1_2.SetNextCondition(LogicConnector.AND, T2Ct2_2);
		T2Ct1_2.SetNextCondition(LogicConnector.AND, T2Ct3_2);
		

		GuardMapping grdT2_2 = new GuardMapping();
		grdT2_2.condition= T2Ct1_2;
		grdT2_2.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "plusTL1"));
		ArrayList<String> lstInput = new ArrayList<String>();
		lstInput.add("counter");
		lstInput.add("subConstantValue1");
		grdT2_2.Activations.add(new Activation(t2, lstInput, TransitionOperation.Sub, "counter"));
		
		t2.GuardMappingList.add(grdT2_2);
		
		
		Condition T2Ct1_3 = new Condition(t2, "counter", TransitionCondition.Equal,"subConstantValue0");
		Condition T2Ct2_3 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
		T2Ct1_3.SetNextCondition(LogicConnector.AND, T2Ct2_3);
		

		GuardMapping grdT2_3 = new GuardMapping();
		grdT2_3.condition= T2Ct1_3;
		grdT2_3.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
		grdT2_3.Activations.add(new Activation(t2, "initialValue", TransitionOperation.Move, "counter"));
		grdT2_3.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP15"));
		
		t2.GuardMappingList.add(grdT2_3);
	
		t2.Delay = 5;
		pn.Transitions.add(t2);
		
		//----------------------------T1Plus--------------------------------
		PetriTransition t1Plus = new PetriTransition(pn);
		t1Plus.TransitionName = "t1Plus";
		t1Plus.InputPlaceName.add("g1r2r3r4");
		
		Condition t1PlusCt1 = new Condition(t1Plus, "plusTL1", TransitionCondition.NotNull);
		

		GuardMapping grdt1Plus = new GuardMapping();
		grdt1Plus.condition= t1PlusCt1;
		grdt1Plus.Activations.add(new Activation(t1Plus, "plusTL1", TransitionOperation.Move, "g1r2r3r4"));
		
		
		t1Plus.GuardMappingList.add(grdt1Plus);
		
		t1Plus.Delay = 0;
		pn.Transitions.add(t1Plus);
		//----------------------------T3------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T3";
		t3.InputPlaceName.add("y1r2r3r4");
		
		
		
		Condition T3Ct1 = new Condition(t2, "y1r2r3r4", TransitionCondition.NotNull);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition= T3Ct1;
		grdT3.Activations.add(new Activation(t3, "y1r2r3r4", TransitionOperation.Move, "r1g2r3r4"));
		grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "OP15"));
		grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "OP17"));
				
		t3.GuardMappingList.add(grdT3);
	
		t3.Delay = 5;
		pn.Transitions.add(t3);
		
		
		//----------------------------T4------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T4";
		t4.InputPlaceName.add("r1g2r3r4");
		
		
		Condition T4Ct1 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
		Condition T4Ct2 = new Condition(t4, "in2_2", TransitionCondition.IsNull);
		T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition= T4Ct1;
		grdT4.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
		grdT4.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP17"));
		grdT4.Activations.add(new Activation(t4, "counter2", TransitionOperation.Move, "counter2"));
		
		t4.GuardMappingList.add(grdT4);
		
		Condition T4Ct1_2 = new Condition(t4, "in2_2", TransitionCondition.NotNull);
		Condition T4Ct2_2 = new Condition(t4, "counter2", TransitionCondition.MoreThan,"subConstantValue0");
		Condition T4Ct3_2 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
		T4Ct1_2.SetNextCondition(LogicConnector.AND, T4Ct2_2);
		T4Ct1_2.SetNextCondition(LogicConnector.AND, T4Ct3_2);
		

		GuardMapping grdT4_2 = new GuardMapping();
		grdT4_2.condition= T4Ct1_2;
		grdT4_2.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "plusTL2"));
		ArrayList<String> lstInput2 = new ArrayList<String>();
		lstInput2.add("counter2");
		lstInput2.add("subConstantValue1");
		grdT4_2.Activations.add(new Activation(t4, lstInput2, TransitionOperation.Sub, "counter2"));
		
		t2.GuardMappingList.add(grdT4_2);
		
		
		Condition T4Ct1_3 = new Condition(t4, "counter2", TransitionCondition.Equal,"subConstantValue0");
		Condition T4Ct2_3 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
		T4Ct1_3.SetNextCondition(LogicConnector.AND, T4Ct2_3);
		

		GuardMapping grdT4_3 = new GuardMapping();
		grdT4_3.condition= T4Ct1_3;
		grdT4_3.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
		grdT4_3.Activations.add(new Activation(t4, "initialValue", TransitionOperation.Move, "counter2"));
		grdT4_3.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP17"));
		
		t4.GuardMappingList.add(grdT4_3);
	
		t4.Delay = 5;
		pn.Transitions.add(t4);
		
		//----------------------------T2Plus--------------------------------
		PetriTransition t2Plus = new PetriTransition(pn);
		t2Plus.TransitionName = "t2Plus";
		t2Plus.InputPlaceName.add("r1g2r3r4");
		
		Condition t2PlusCt1 = new Condition(t2Plus, "plusTL2", TransitionCondition.NotNull);
		

		GuardMapping grdt2Plus = new GuardMapping();
		grdt2Plus.condition= t2PlusCt1;
		grdt2Plus.Activations.add(new Activation(t2Plus, "plusTL2", TransitionOperation.Move, "r1g2r3r4"));
		
		
		t2Plus.GuardMappingList.add(grdt2Plus);
		
		t2Plus.Delay = 0;
		pn.Transitions.add(t2Plus);
		
		
		//----------------------------T5------------------------------------
		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T5";
		t5.InputPlaceName.add("r1y2r3r4");
		
		
		Condition T5Ct1 = new Condition(t5, "r1y2r3r4", TransitionCondition.NotNull);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition= T5Ct1;
		grdT5.Activations.add(new Activation(t5, "r1y2r3r4", TransitionOperation.Move, "r1r2g3r4"));
		grdT5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "OP17"));
		grdT5.Activations.add(new Activation(t5, "green", TransitionOperation.SendOverNetwork, "OP19"));

		
		t5.GuardMappingList.add(grdT5);
	
		t5.Delay = 5;
		pn.Transitions.add(t5);
		
		//----------------------------T6------------------------------------
		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T6";
		t6.InputPlaceName.add("r1r2g3r4");
		
		
		Condition T6Ct1 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
		Condition T6Ct2 = new Condition(t6, "in2_3", TransitionCondition.IsNull);
		T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

		GuardMapping grdT6 = new GuardMapping();
		grdT6.condition= T6Ct1;
		grdT6.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
		grdT6.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP19"));
		grdT6.Activations.add(new Activation(t6, "counter3", TransitionOperation.Move, "counter3"));
		
		t6.GuardMappingList.add(grdT6);
		
		Condition T6Ct1_2 = new Condition(t6, "in2_3", TransitionCondition.NotNull);
		Condition T6Ct2_2 = new Condition(t6, "counter3", TransitionCondition.MoreThan,"subConstantValue0");
		Condition T6Ct3_2 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
		T6Ct1_2.SetNextCondition(LogicConnector.AND, T6Ct2_2);
		T6Ct1_2.SetNextCondition(LogicConnector.AND, T6Ct3_2);
		

		GuardMapping grdT6_2 = new GuardMapping();
		grdT6_2.condition= T6Ct1_2;
		grdT6_2.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "plusTL3"));
		ArrayList<String> lstInput3 = new ArrayList<String>();
		lstInput3.add("counter3");
		lstInput3.add("subConstantValue1");
		grdT6_2.Activations.add(new Activation(t6, lstInput3, TransitionOperation.Sub, "counter3"));
		
		t6.GuardMappingList.add(grdT6_2);
		
		
		Condition T6Ct1_3 = new Condition(t6, "counter3", TransitionCondition.Equal,"subConstantValue0");
		Condition T6Ct2_3 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
		T6Ct1_3.SetNextCondition(LogicConnector.AND, T6Ct2_3);
		

		GuardMapping grdT6_3 = new GuardMapping();
		grdT6_3.condition= T6Ct1_3;
		grdT6_3.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
		grdT6_3.Activations.add(new Activation(t6, "initialValue", TransitionOperation.Move, "counter3"));
		grdT6_3.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP19"));
		
		t6.GuardMappingList.add(grdT6_3);
	
		t6.Delay = 5;
		pn.Transitions.add(t6);
		
		//----------------------------T3Plus--------------------------------
		PetriTransition t3Plus = new PetriTransition(pn);
		t3Plus.TransitionName = "t3Plus";
		t3Plus.InputPlaceName.add("r1r2g3r4");
		
		Condition t3PlusCt1 = new Condition(t3Plus, "plusTL3", TransitionCondition.NotNull);
		

		GuardMapping grdt3Plus = new GuardMapping();
		grdt3Plus.condition= t3PlusCt1;
		grdt3Plus.Activations.add(new Activation(t3Plus, "plusTL3", TransitionOperation.Move, "r1r2g3r4"));
		
		
		t3Plus.GuardMappingList.add(grdt3Plus);
		
		t3Plus.Delay = 0;
		pn.Transitions.add(t3Plus);
		
		//----------------------------T7------------------------------------
		PetriTransition t7 = new PetriTransition(pn);
		t7.TransitionName = "T7";
		t7.InputPlaceName.add("r1r2y3r4");
		
		
		Condition T7Ct1 = new Condition(t7, "r1r2y3r4", TransitionCondition.NotNull);

		GuardMapping grdT7 = new GuardMapping();
		grdT7.condition= T7Ct1;
		grdT7.Activations.add(new Activation(t7, "r1r2y3r4", TransitionOperation.Move, "r1r2r3g4"));
		grdT7.Activations.add(new Activation(t7, "red", TransitionOperation.SendOverNetwork, "OP19"));
		grdT7.Activations.add(new Activation(t7, "green", TransitionOperation.SendOverNetwork, "OP9"));

		
		t7.GuardMappingList.add(grdT7);
	
		t7.Delay = 5;
		pn.Transitions.add(t7);
		
		
		//----------------------------T8------------------------------------
		PetriTransition t8 = new PetriTransition(pn);
		t8.TransitionName = "T8";
		t8.InputPlaceName.add("r1r2r3g4");
		
		
		Condition T8Ct1 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
		Condition T8Ct2 = new Condition(t8, "in2_4", TransitionCondition.IsNull);
		T8Ct1.SetNextCondition(LogicConnector.AND, T8Ct2);

		GuardMapping grdT8 = new GuardMapping();
		grdT8.condition= T8Ct1;
		grdT8.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
		grdT8.Activations.add(new Activation(t8, "yellow", TransitionOperation.SendOverNetwork, "OP9"));
		grdT8.Activations.add(new Activation(t8, "counter4", TransitionOperation.Move, "counter4"));
		
		t8.GuardMappingList.add(grdT8);
		
		Condition T8Ct1_2 = new Condition(t8, "in2_4", TransitionCondition.NotNull);
		Condition T8Ct2_2 = new Condition(t8, "counter4", TransitionCondition.MoreThan,"subConstantValue0");
		Condition T8Ct3_2 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
		T8Ct1_2.SetNextCondition(LogicConnector.AND, T8Ct2_2);
		T8Ct1_2.SetNextCondition(LogicConnector.AND, T8Ct3_2);
		

		GuardMapping grdT8_2 = new GuardMapping();
		grdT8_2.condition= T8Ct1_2;
		grdT8_2.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "plusTL4"));
		ArrayList<String> lstInput4 = new ArrayList<String>();
		lstInput4.add("counter4");
		lstInput4.add("subConstantValue1");
		grdT8_2.Activations.add(new Activation(t8, lstInput4, TransitionOperation.Sub, "counter4"));
		
		t8.GuardMappingList.add(grdT8_2);
		
		
		Condition T8Ct1_3 = new Condition(t8, "counter4", TransitionCondition.Equal,"subConstantValue0");
		Condition T8Ct2_3 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
		T8Ct1_3.SetNextCondition(LogicConnector.AND, T8Ct2_3);
		

		GuardMapping grdT8_3 = new GuardMapping();
		grdT8_3.condition= T8Ct1_3;
		grdT8_3.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
		grdT8_3.Activations.add(new Activation(t8, "initialValue", TransitionOperation.Move, "counter4"));
		grdT8_3.Activations.add(new Activation(t8, "yellow", TransitionOperation.SendOverNetwork, "OP9"));
		
		t8.GuardMappingList.add(grdT8_3);
	
		t8.Delay = 5;
		pn.Transitions.add(t8);
		
		//----------------------------T4Plus--------------------------------
		PetriTransition t4Plus = new PetriTransition(pn);
		t4Plus.TransitionName = "t4Plus";
		t4Plus.InputPlaceName.add("r1r2r3g4");
		
		Condition t4PlusCt1 = new Condition(t4Plus, "plusTL4", TransitionCondition.NotNull);
		

		GuardMapping grdt4Plus = new GuardMapping();
		grdt4Plus.condition= t4PlusCt1;
		grdt4Plus.Activations.add(new Activation(t4Plus, "plusTL4", TransitionOperation.Move, "r1r2r3g4"));
		
		
		t4Plus.GuardMappingList.add(grdt4Plus);
		
		t4Plus.Delay = 0;
		pn.Transitions.add(t4Plus);
		
		//----------------------------T9------------------------------------
		PetriTransition t9 = new PetriTransition(pn);
		t9.TransitionName = "T9";
		t9.InputPlaceName.add("r1r2r3y4");
		
		
		Condition T9Ct1 = new Condition(t9, "r1r2r3y4", TransitionCondition.NotNull);

		GuardMapping grdT9 = new GuardMapping();
		grdT9.condition= T9Ct1;
		grdT9.Activations.add(new Activation(t9, "r1r2r3y4", TransitionOperation.Move, "r1r2r3r4"));
		grdT9.Activations.add(new Activation(t9, "red", TransitionOperation.SendOverNetwork, "OP9"));

		
		t9.GuardMappingList.add(grdT9);
	
		t9.Delay = 5;
		pn.Transitions.add(t9);
		
		// -------------------------------------------------------------------------------------
		// ----------------------------PN Start-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("Exp1 started \n ------------------------------");
		pn.Delay = 2000;
		// pn.Start();

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
		
		
}

}
