package CtrlAltElite;

import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Lanes_Intersection {
	public static void main(String[] args) {

		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Lanes Intersection";

		pn.NetworkPort = 1080;

		DataString green = new DataString();
		green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.ConstantPlaceList.add(green);

		DataString full = new DataString();
		full.SetName("full");
		full.SetValue("full");
		pn.ConstantPlaceList.add(full);

		// -------------------------------Intersection 1-----------------------
		// ------------------------------Lane 1--------------------------------
		DataCar p0 = new DataCar();
		p0.SetName("P_a1");
		pn.PlaceList.add(p0);

		DataCarQueue p1 = new DataCarQueue();
		p1.Value.Size = 3;
		p1.SetName("P_x1");
		pn.PlaceList.add(p1);

		DataString p2 = new DataString();
		p2.SetName("P_TL1");
		pn.PlaceList.add(p2);

		DataCar p3 = new DataCar();
		p3.SetName("P_b1");
		pn.PlaceList.add(p3);

		// --------------------------------Intersection 1--------------------------------------
		// -------------------------------Lane 2-----------------------------------------------


		DataCar p4 = new DataCar();
		p4.SetName("P_a2");
		pn.PlaceList.add(p4);

		DataCarQueue p5 = new DataCarQueue();
		p5.Value.Size = 3;
		p5.SetName("P_x2");
		pn.PlaceList.add(p5);

		DataString p6 = new DataString();
		p6.SetName("P_TL2");
		pn.PlaceList.add(p6);

		DataCar p7 = new DataCar(); //
		p7.SetName("P_b2");
		pn.PlaceList.add(p7);

		// --------------------------------Intersection 1--------------------------------------
		// -------------------------------Lane 3-----------------------------------------------


		DataCar p8 = new DataCar();
		p8.SetName("P_a3");
		pn.PlaceList.add(p8);

		DataCarQueue p9 = new DataCarQueue();
		p9.Value.Size = 3;
		p9.SetName("P_x3");
		pn.PlaceList.add(p9);

		DataString p10 = new DataString(); // p11.Printable = false;
		p10.SetName("P_TL3");
		pn.PlaceList.add(p10);

		DataCar p11 = new DataCar(); // p12.Printable = false;
		p11.SetName("P_b3");
		pn.PlaceList.add(p11);

		// --------------------------------Intersection 1--------------------------------------
		// --------------------------------Lane4-----------------------------------------------
		// ------------------------------------------------------------------------------------

		DataCarQueue p14 = new DataCarQueue();
		p14.Value.Size = 3;
		p14.SetName("P_x4");
		pn.PlaceList.add(p14);

		DataString p13 = new DataString();
		p13.SetName("P_TL4");
		pn.PlaceList.add(p13);

		DataCar p12 = new DataCar();
		p12.SetName("P_b4");
		pn.PlaceList.add(p12);

		// ----------------------------Intersection 1----------------------------------
		// ----------------------------Exit lane 2-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p30 = new DataCarQueue();
		p30.Value.Size = 3;
		p30.SetName("P_o2");
		pn.PlaceList.add(p30);


		// -------------------------------Intersection 2-----------------------
		// -------------------------------Lane1--------------------------------

		DataCar p18 = new DataCar();
		p18.SetName("P2_a1");
		pn.PlaceList.add(p18);

		DataCarQueue p19 = new DataCarQueue();
		p19.Value.Size = 3;
		p19.SetName("P2_x1");
		pn.PlaceList.add(p19);

		DataString p20 = new DataString();
		p20.SetName("P2_TL1");
		pn.PlaceList.add(p20);

		DataCar p21 = new DataCar();
		p21.SetName("P2_b1");
		pn.PlaceList.add(p21);

		// --------------------------------Intersection 2--------------------------------------
		// --------------------------------Lane 2-----------------------------------------------

		DataCarQueue p17 = new DataCarQueue();
		p17.Value.Size = 3;
		p17.SetName("P2_x2");
		pn.PlaceList.add(p17);

		DataString p16 = new DataString();
		p16.SetName("P2_TL2");
		pn.PlaceList.add(p16);

		DataCar p15 = new DataCar();
		p15.SetName("P2_b2");
		pn.PlaceList.add(p15);

		// -------------------------------Intersection 2-----------------------
		// -------------------------------Lane3--------------------------------

		DataCar p22 = new DataCar();
		p22.SetName("P2_a3");
		pn.PlaceList.add(p22);

		DataCarQueue p23 = new DataCarQueue();
		p23.Value.Size = 3;
		p23.SetName("P2_x3");
		pn.PlaceList.add(p23);

		DataString p24 = new DataString();
		p24.SetName("P2_TL3");
		pn.PlaceList.add(p24);

		DataCar p25 = new DataCar();
		p25.SetName("P2_b3");
		pn.PlaceList.add(p25);

		// -------------------------------Intersection 2-----------------------
		// -------------------------------Lane4--------------------------------

		DataCar p26 = new DataCar();
		p26.SetName("P2_a4");
		pn.PlaceList.add(p26);

		DataCarQueue p27 = new DataCarQueue();
		p27.Value.Size = 3;
		p27.SetName("P2_x4");
		pn.PlaceList.add(p27);

		DataString p28 = new DataString();
		p28.SetName("P2_TL4");
		pn.PlaceList.add(p28);

		DataCar p29 = new DataCar();
		p29.SetName("P2_b4");
		pn.PlaceList.add(p29);

		// ----------------------------Intersection 2----------------------------------
		// ----------------------------Exit lane 1-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p31 = new DataCarQueue(); // p17.Printable = false;
		p31.Value.Size = 3;
		p31.SetName("P2_o1");
		pn.PlaceList.add(p31);

		// ----------------------------Intersection 2----------------------------------
		// ----------------------------Exit lane 4-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p32 = new DataCarQueue(); // p21.Printable = false;
		p32.Value.Size = 3;
		p32.SetName("P2_o4");
		pn.PlaceList.add(p32);

		// OP 
		DataTransfer OP1 = new DataTransfer();
		OP1.SetName("OP1");
		OP1.Value = new TransferOperation("localhost", "1081", "in1");
		pn.PlaceList.add(OP1);

		DataTransfer OP3 = new DataTransfer();
		OP3.SetName("OP3");
		OP3.Value = new TransferOperation("localhost", "1081", "in2");
		pn.PlaceList.add(OP3);

		DataTransfer OP5 = new DataTransfer();
		OP5.SetName("OP5");
		OP5.Value = new TransferOperation("localhost", "1081", "in3");
		pn.PlaceList.add(OP5);
		
		DataTransfer OP26 = new DataTransfer();
		OP26.SetName("OP26");
		OP26.Value = new TransferOperation("localhost", "1081", "in4");
		pn.PlaceList.add(OP26);

		DataTransfer OP15 = new DataTransfer();
		OP15.SetName("OP15");
		OP15.Value = new TransferOperation("localhost", "1082", "in2_1");
		pn.PlaceList.add(OP15);

		DataTransfer OP17 = new DataTransfer();
		OP17.SetName("OP17");
		OP17.Value = new TransferOperation("localhost", "1082", "in2_3");
		pn.PlaceList.add(OP17);

		DataTransfer OP19 = new DataTransfer();
		OP19.SetName("OP19");
		OP19.Value = new TransferOperation("localhost", "1082", "in2_3");
		pn.PlaceList.add(OP19);
		
		DataTransfer OP9 = new DataTransfer();
		OP9.SetName("OP9");
		OP9.Value = new TransferOperation("localhost", "1082", "in2_4");
		pn.PlaceList.add(OP9);
		
		// -------------------------------------------------------------------------------------------
		// --------------------------------Intersections---------------------------------------------
		// -------------------------------------------------------------------------------------------

		DataCarQueue p33 = new DataCarQueue();
		p33.Value.Size = 3;
		p33.SetName("P_I");
		pn.PlaceList.add(p33);
		
		DataCarQueue p34 = new DataCarQueue();
		p34.Value.Size = 3;
		p34.SetName("P2_I");
		pn.PlaceList.add(p34);

		// T1 ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T_u1";
		t1.InputPlaceName.add("P_a1");
		t1.InputPlaceName.add("P_x1");

		Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition = T1Ct1;
		grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));
		t1.GuardMappingList.add(grdT1);

		Condition T1Ct3 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct4 = new Condition(t1, "P_x1", TransitionCondition.CanNotAddCars);
		T1Ct3.SetNextCondition(LogicConnector.AND, T1Ct4);

		GuardMapping grdT1o = new GuardMapping();
		grdT1o.condition = T1Ct3;
		grdT1o.Activations.add(new Activation(t1, "full", TransitionOperation.SendOverNetwork, "OP1"));
		grdT1o.Activations.add(new Activation(t1, "P_a1", TransitionOperation.Move, "P_a1"));
		t1.GuardMappingList.add(grdT1o);

		t1.Delay = 0;
		pn.Transitions.add(t1);

		// T2
		// ---------------------------------------------------------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T_e1";
		t2.InputPlaceName.add("P_x1");
		t2.InputPlaceName.add("P_TL1");

		Condition T2Ct1 = new Condition(t2, "P_TL1", TransitionCondition.Equal, "green");
		Condition T2Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveCar);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition = T2Ct1;
		grdT2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
		grdT2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));

		t2.GuardMappingList.add(grdT2);

		t2.Delay = 0;
		pn.Transitions.add(t2);

		// T3
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T_u2";
		t3.InputPlaceName.add("P_a2");
		t3.InputPlaceName.add("P_x2");

		Condition T3Ct1 = new Condition(t3, "P_a2", TransitionCondition.NotNull);
		Condition T3Ct2 = new Condition(t3, "P_x2", TransitionCondition.CanAddCars);
		T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

		Condition T3Ct3 = new Condition(t3, "P_a2", TransitionCondition.NotNull);
		Condition T3Ct4 = new Condition(t3, "P_x2", TransitionCondition.CanNotAddCars);
		T3Ct3.SetNextCondition(LogicConnector.AND, T3Ct4);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition = T3Ct1;
		grdT3.Activations.add(new Activation(t3, "P_a2", TransitionOperation.AddElement, "P_x2"));
		t3.GuardMappingList.add(grdT3);

		GuardMapping grdT3o = new GuardMapping();
		grdT3o.condition = T3Ct3;
		grdT3o.Activations.add(new Activation(t3, "full", TransitionOperation.SendOverNetwork, "OP3"));
		grdT3o.Activations.add(new Activation(t3, "P_a2", TransitionOperation.Move, "P_a2"));
		t3.GuardMappingList.add(grdT3o);

		t3.Delay = 0;
		pn.Transitions.add(t3);

		// T4
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T_e2";
		t4.InputPlaceName.add("P_x2");
		t4.InputPlaceName.add("P_TL2");

		Condition T4Ct1 = new Condition(t4, "P_TL2", TransitionCondition.Equal, "green");
		Condition T4Ct2 = new Condition(t4, "P_x2", TransitionCondition.HaveCar);
		T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition = T4Ct1;
		grdT4.Activations.add(new Activation(t4, "P_x2", TransitionOperation.PopElementWithoutTarget, "P_b3"));
		grdT4.Activations.add(new Activation(t4, "P_TL2", TransitionOperation.Move, "P_TL2"));
		t4.GuardMappingList.add(grdT4);

		t4.Delay = 0;
		pn.Transitions.add(t4);

		// T5
		// -----------------------------------------------------------------------------------------------------

		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T_u3";
		t5.InputPlaceName.add("P_a3");
		t5.InputPlaceName.add("P_x3");

		Condition T5Ct1 = new Condition(t5, "P_a3", TransitionCondition.NotNull);
		Condition T5Ct2 = new Condition(t5, "P_x3", TransitionCondition.CanAddCars);
		T5Ct1.SetNextCondition(LogicConnector.AND, T5Ct2);

		Condition T5Ct3 = new Condition(t5, "P_a3", TransitionCondition.NotNull);
		Condition T5Ct4 = new Condition(t5, "P_x3", TransitionCondition.CanNotAddCars);
		T5Ct3.SetNextCondition(LogicConnector.AND, T5Ct4);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition = T5Ct1;
		grdT5.Activations.add(new Activation(t5, "P_a3", TransitionOperation.AddElement, "P_x3"));
		t5.GuardMappingList.add(grdT5);

		GuardMapping grdT5o = new GuardMapping();
		grdT5o.condition = T5Ct3;
		grdT5o.Activations.add(new Activation(t5, "full", TransitionOperation.SendOverNetwork, "OP5"));
		grdT5o.Activations.add(new Activation(t5, "P_a3", TransitionOperation.Move, "P_a3"));
		t5.GuardMappingList.add(grdT5o);

		t5.Delay = 0;
		pn.Transitions.add(t5);
		
		// T6
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T_e3";
		t6.InputPlaceName.add("P_x3");
		t6.InputPlaceName.add("P_TL3");

		Condition T6Ct1 = new Condition(t6, "P_TL3", TransitionCondition.Equal, "green");
		Condition T6Ct2 = new Condition(t6, "P_x3", TransitionCondition.HaveCar);
		T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

		GuardMapping grdT6 = new GuardMapping();
		grdT6.condition = T6Ct1;
		grdT6.Activations.add(new Activation(t6, "P_x3", TransitionOperation.PopElementWithoutTarget, "P_b3"));
		grdT6.Activations.add(new Activation(t6, "P_TL3", TransitionOperation.Move, "P_TL3"));

		t6.GuardMappingList.add(grdT6);

		t6.Delay = 0;
		pn.Transitions.add(t6);
		
		// T7
		//-----------------------------------------------------------------------------------------------------
		PetriTransition t7 = new PetriTransition(pn);
		t7.TransitionName = "T_i4";
		t7.InputPlaceName.add("P_b4");
		t7.InputPlaceName.add("P_I");

		Condition T7Ct1 = new Condition(t7, "P_b4", TransitionCondition.NotNull);
		Condition T7Ct2 = new Condition(t7, "P_I", TransitionCondition.CanAddCars);
		T7Ct1.SetNextCondition(LogicConnector.AND, T7Ct2);

		GuardMapping grdT7 = new GuardMapping();
		grdT7.condition = T7Ct1;
		grdT7.Activations.add(new Activation(t7, "P_b4", TransitionOperation.AddElement, "P_I"));
		t7.GuardMappingList.add(grdT7);

		t7.Delay = 0;
		pn.Transitions.add(t7);
		
		// T8
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t8 = new PetriTransition(pn);
		t8.TransitionName = "T_e4";
		t8.InputPlaceName.add("P_x4");
		t8.InputPlaceName.add("P_TL4");

		Condition T8Ct1 = new Condition(t8, "P_TL4", TransitionCondition.Equal, "green");
		Condition T8Ct2 = new Condition(t8, "P_x4", TransitionCondition.HaveCar);
		T8Ct1.SetNextCondition(LogicConnector.AND, T8Ct2);

		GuardMapping grdT8 = new GuardMapping();
		grdT8.condition = T8Ct1;
		grdT8.Activations.add(new Activation(t8, "P_x4", TransitionOperation.PopElementWithoutTarget, "P_b4"));
		grdT8.Activations.add(new Activation(t8, "P_TL4", TransitionOperation.Move, "P_TL4"));

		t8.GuardMappingList.add(grdT8);

		t8.Delay = 0;
		pn.Transitions.add(t8);
		
		// T9
		// -----------------------------------------------------------------------------------------------------

		PetriTransition t9 = new PetriTransition(pn);
		t9.TransitionName = "T2_g2";
		t9.InputPlaceName.add("P_I");
		t9.InputPlaceName.add("P2_x2");

		Condition T9Ct1 = new Condition(t9, "P_I", TransitionCondition.HaveCarForMe);
		Condition T9Ct2 = new Condition(t9, "P2_x2", TransitionCondition.CanAddCars);
		T9Ct1.SetNextCondition(LogicConnector.AND, T9Ct2);
		
		//^
		Condition T9Ct3 = new Condition(t9, "P_I", TransitionCondition.HaveCarForMe);
		Condition T9Ct4 = new Condition(t9, "P2_x2", TransitionCondition.CanNotAddCars);
		T9Ct3.SetNextCondition(LogicConnector.AND, T9Ct4);
		//^

		GuardMapping grdT9 = new GuardMapping();
		grdT9.condition = T9Ct1;
		grdT9.Activations.add(new Activation(t9, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P2_x2"));
		t9.GuardMappingList.add(grdT9);
		
		//^
		GuardMapping grdT9o = new GuardMapping();
		grdT9o.condition = T9Ct3;
		grdT9o.Activations.add(new Activation(t9, "full", TransitionOperation.SendOverNetwork, "OP9"));
		grdT9o.Activations.add(new Activation(t9, "P_I", TransitionOperation.Move, "P_I"));
		t9.GuardMappingList.add(grdT9o);
		//^

		t9.Delay = 0;
		pn.Transitions.add(t9);
		
		// T10
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t10 = new PetriTransition(pn);
		t10.TransitionName = "T2_e2";
		t10.InputPlaceName.add("P2_x2");
		t10.InputPlaceName.add("P2_TL2");

		Condition T10Ct1 = new Condition(t10, "P2_TL2", TransitionCondition.Equal, "green");
		Condition T10Ct2 = new Condition(t10, "P2_x2", TransitionCondition.HaveCar);
		T10Ct1.SetNextCondition(LogicConnector.AND, T10Ct2);

		GuardMapping grdT10 = new GuardMapping();
		grdT10.condition = T10Ct1;
		grdT10.Activations.add(new Activation(t10, "P2_x2", TransitionOperation.PopElementWithoutTarget, "P2_b2"));
		grdT10.Activations.add(new Activation(t10, "P2_TL2", TransitionOperation.Move, "P2_TL2"));

		t10.GuardMappingList.add(grdT10);

		t10.Delay = 0;
		pn.Transitions.add(t10);
		
		// T11
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t11 = new PetriTransition(pn);
		t11.TransitionName = "T_i1";
		t11.InputPlaceName.add("P_b1");
		t11.InputPlaceName.add("P_I");

		Condition T11Ct1 = new Condition(t11, "P_b1", TransitionCondition.NotNull);
		Condition T11Ct2 = new Condition(t11, "P_I", TransitionCondition.CanAddCars);
		T11Ct1.SetNextCondition(LogicConnector.AND, T11Ct2);

		GuardMapping grdT11 = new GuardMapping();
		grdT11.condition = T11Ct1;
		grdT11.Activations.add(new Activation(t11, "P_b1", TransitionOperation.AddElement, "P_I"));
		t11.GuardMappingList.add(grdT11);

		t11.Delay = 0;
		pn.Transitions.add(t11);
		
		// T12
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t12 = new PetriTransition(pn);
		t12.TransitionName = "T_i2";
		t12.InputPlaceName.add("P_b2");
		t12.InputPlaceName.add("P_I");

		Condition T12Ct1 = new Condition(t12, "P_b2", TransitionCondition.NotNull);
		Condition T12Ct2 = new Condition(t12, "P_I", TransitionCondition.CanAddCars);
		T12Ct1.SetNextCondition(LogicConnector.AND, T12Ct2);

		GuardMapping grdT12 = new GuardMapping();
		grdT12.condition = T12Ct1;
		grdT12.Activations.add(new Activation(t12, "P_b2", TransitionOperation.AddElement, "P_I"));
		t12.GuardMappingList.add(grdT12);

		t12.Delay = 0;
		pn.Transitions.add(t12);
		
		// T13
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t13 = new PetriTransition(pn);
		t13.TransitionName = "T_i3";
		t13.InputPlaceName.add("P_b3");
		t13.InputPlaceName.add("P_I");

		Condition T13Ct1 = new Condition(t13, "P_b3", TransitionCondition.NotNull);
		Condition T13Ct2 = new Condition(t13, "P_I", TransitionCondition.CanAddCars);
		T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

		GuardMapping grdT13 = new GuardMapping();
		grdT13.condition = T13Ct1;
		grdT13.Activations.add(new Activation(t13, "P_b3", TransitionOperation.AddElement, "P_I"));
		t13.GuardMappingList.add(grdT13);

		t13.Delay = 0;
		pn.Transitions.add(t13);
		
		// T14
		//----------------------------------------------------------------------------------------------------------------
		PetriTransition t14 = new PetriTransition(pn);
		t14.TransitionName = "T_g2";
		t14.InputPlaceName.add("P_I");
		t14.InputPlaceName.add("P_o2");

		Condition T14Ct1 = new Condition(t14, "P_I", TransitionCondition.HaveCarForMe);
		Condition T14Ct2 = new Condition(t14, "P_o2", TransitionCondition.CanAddCars);
		T14Ct1.SetNextCondition(LogicConnector.AND, T14Ct2);

		GuardMapping grdT14 = new GuardMapping();
		grdT14.condition = T14Ct1;
		grdT14.Activations.add(new Activation(t14, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o2"));
		t14.GuardMappingList.add(grdT14);

		t14.Delay = 0;
		pn.Transitions.add(t14);
		
		// T15
		//----------------------------------------------------------------------------------------------------------------
		PetriTransition t15 = new PetriTransition(pn);
		t15.TransitionName = "T2_u1";
		t15.InputPlaceName.add("P2_a1");
		t15.InputPlaceName.add("P2_x1");

		Condition T15Ct1 = new Condition(t15, "P2_a1", TransitionCondition.NotNull);
		Condition T15Ct2 = new Condition(t15, "P2_x1", TransitionCondition.CanAddCars);
		T15Ct1.SetNextCondition(LogicConnector.AND, T15Ct2);

		GuardMapping grdT15 = new GuardMapping();
		grdT15.condition = T15Ct1;
		grdT15.Activations.add(new Activation(t15, "P2_a1", TransitionOperation.AddElement, "P2_x1"));
		t15.GuardMappingList.add(grdT15);

		Condition T15Ct3 = new Condition(t15, "P2_a1", TransitionCondition.NotNull);
		Condition T15Ct4 = new Condition(t15, "P2_x1", TransitionCondition.CanNotAddCars);
		T15Ct3.SetNextCondition(LogicConnector.AND, T15Ct4);

		GuardMapping grdT15o = new GuardMapping();
		grdT15o.condition = T15Ct3;
		grdT15o.Activations.add(new Activation(t15, "full", TransitionOperation.SendOverNetwork, "OP15"));
		grdT15o.Activations.add(new Activation(t15, "P2_a1", TransitionOperation.Move, "P2_a1"));
		t15.GuardMappingList.add(grdT15o);

		t15.Delay = 0;
		pn.Transitions.add(t15);
		
		// T16
		// ---------------------------------------------------------------------------------------------------
		PetriTransition t16 = new PetriTransition(pn);
		t16.TransitionName = "T2_e1";
		t16.InputPlaceName.add("P2_x1");
		t16.InputPlaceName.add("P2_TL1");

		Condition T16Ct1 = new Condition(t16, "P2_TL1", TransitionCondition.Equal, "green");
		Condition T16Ct2 = new Condition(t16, "P2_x1", TransitionCondition.HaveCar);
		T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);

		GuardMapping grdT16 = new GuardMapping();
		grdT16.condition = T16Ct1;
		grdT16.Activations.add(new Activation(t16, "P2_x1", TransitionOperation.PopElementWithoutTarget, "P2_b1"));
		grdT16.Activations.add(new Activation(t16, "P2_TL1", TransitionOperation.Move, "P2_TL1"));

		t16.GuardMappingList.add(grdT16);

		t16.Delay = 0;
		pn.Transitions.add(t16);
		
		// T17
		// -----------------------------------------------------------------------------------------------------

		PetriTransition t17 = new PetriTransition(pn);
		t17.TransitionName = "T2_u3";
		t17.InputPlaceName.add("P2_a3");
		t17.InputPlaceName.add("P2_x3");

		Condition T17Ct1 = new Condition(t17, "P2_a3", TransitionCondition.NotNull);
		Condition T17Ct2 = new Condition(t17, "P2_x3", TransitionCondition.CanAddCars);
		T17Ct1.SetNextCondition(LogicConnector.AND, T17Ct2);

		Condition T17Ct3 = new Condition(t17, "P2_a3", TransitionCondition.NotNull);
		Condition T17Ct4 = new Condition(t17, "P2_x3", TransitionCondition.CanNotAddCars);
		T17Ct3.SetNextCondition(LogicConnector.AND, T17Ct4);

		GuardMapping grdT17 = new GuardMapping();
		grdT17.condition = T17Ct1;
		grdT17.Activations.add(new Activation(t17, "P2_a3", TransitionOperation.AddElement, "P2_x3"));
		t17.GuardMappingList.add(grdT17);

		GuardMapping grdT17o = new GuardMapping();
		grdT17o.condition = T17Ct3;
		grdT17o.Activations.add(new Activation(t17, "full", TransitionOperation.SendOverNetwork, "OP17"));
		grdT17o.Activations.add(new Activation(t17, "P2_a3", TransitionOperation.Move, "P2_a3"));
		t17.GuardMappingList.add(grdT17o);

		t17.Delay = 0;
		pn.Transitions.add(t17);
		
		// T18
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t18 = new PetriTransition(pn);
		t18.TransitionName = "T2_e3";
		t18.InputPlaceName.add("P2_x3");
		t18.InputPlaceName.add("P2_TL3");

		Condition T18Ct1 = new Condition(t18, "P2_TL3", TransitionCondition.Equal, "green");
		Condition T18Ct2 = new Condition(t18, "P2_x3", TransitionCondition.HaveCar);
		T18Ct1.SetNextCondition(LogicConnector.AND, T18Ct2);

		GuardMapping grdT18 = new GuardMapping();
		grdT18.condition = T18Ct1;
		grdT18.Activations.add(new Activation(t18, "P2_x3", TransitionOperation.PopElementWithoutTarget, "P2_b3"));
		grdT18.Activations.add(new Activation(t18, "P2_TL3", TransitionOperation.Move, "P2_TL3"));

		t18.GuardMappingList.add(grdT18);

		t18.Delay = 0;
		pn.Transitions.add(t18);
		
		// T19
		// -----------------------------------------------------------------------------------------------------

		PetriTransition t19 = new PetriTransition(pn);
		t19.TransitionName = "T2_u4";
		t19.InputPlaceName.add("P2_a4");
		t19.InputPlaceName.add("P2_x4");

		Condition T19Ct1 = new Condition(t19, "P2_a4", TransitionCondition.NotNull);
		Condition T19Ct2 = new Condition(t19, "P2_x4", TransitionCondition.CanAddCars);
		T19Ct1.SetNextCondition(LogicConnector.AND, T19Ct2);

		Condition T19Ct3 = new Condition(t19, "P2_a4", TransitionCondition.NotNull);
		Condition T19Ct4 = new Condition(t19, "P2_x4", TransitionCondition.CanNotAddCars);
		T19Ct3.SetNextCondition(LogicConnector.AND, T19Ct4);

		GuardMapping grdT19 = new GuardMapping();
		grdT19.condition = T19Ct1;
		grdT19.Activations.add(new Activation(t19, "P2_a4", TransitionOperation.AddElement, "P2_x4"));
		t19.GuardMappingList.add(grdT19);

		GuardMapping grdT19o = new GuardMapping();
		grdT19o.condition = T19Ct3;
		grdT19o.Activations.add(new Activation(t19, "full", TransitionOperation.SendOverNetwork, "OP19"));
		grdT19o.Activations.add(new Activation(t19, "P2_a4", TransitionOperation.Move, "P2_a4"));
		t19.GuardMappingList.add(grdT19o);

		t19.Delay = 0;
		pn.Transitions.add(t19);
		
		// T20
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t20 = new PetriTransition(pn);
		t20.TransitionName = "T2_e4";
		t20.InputPlaceName.add("P2_x4");
		t20.InputPlaceName.add("P2_TL4");

		Condition T20Ct1 = new Condition(t20, "P2_TL4", TransitionCondition.Equal, "green");
		Condition T20Ct2 = new Condition(t20, "P2_x4", TransitionCondition.HaveCar);
		T20Ct1.SetNextCondition(LogicConnector.AND, T20Ct2);

		GuardMapping grdT20 = new GuardMapping();
		grdT20.condition = T20Ct1;
		grdT20.Activations.add(new Activation(t20, "P2_x4", TransitionOperation.PopElementWithoutTarget, "P2_b4"));
		grdT20.Activations.add(new Activation(t20, "P2_TL4", TransitionOperation.Move, "P2_TL4"));

		t20.GuardMappingList.add(grdT20);

		t20.Delay = 0;
		pn.Transitions.add(t20);
		
		// T21
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t21 = new PetriTransition(pn);
		t21.TransitionName = "T2_i1";
		t21.InputPlaceName.add("P2_b1");
		t21.InputPlaceName.add("P2_I");

		Condition T21Ct1 = new Condition(t21, "P2_b1", TransitionCondition.NotNull);
		Condition T21Ct2 = new Condition(t21, "P2_I", TransitionCondition.CanAddCars);
		T21Ct1.SetNextCondition(LogicConnector.AND, T21Ct2);

		GuardMapping grdT21 = new GuardMapping();
		grdT21.condition = T21Ct1;
		grdT21.Activations.add(new Activation(t21, "P2_b1", TransitionOperation.AddElement, "P2_I"));
		t21.GuardMappingList.add(grdT21);

		t21.Delay = 0;
		pn.Transitions.add(t21);
		
		// T22
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t22 = new PetriTransition(pn);
		t22.TransitionName = "T2_i3";
		t22.InputPlaceName.add("P2_b3");
		t22.InputPlaceName.add("P2_I");

		Condition T22Ct1 = new Condition(t22, "P2_b3", TransitionCondition.NotNull);
		Condition T22Ct2 = new Condition(t22, "P2_I", TransitionCondition.CanAddCars);
		T22Ct1.SetNextCondition(LogicConnector.AND, T22Ct2);

		GuardMapping grdT22 = new GuardMapping();
		grdT22.condition = T22Ct1;
		grdT22.Activations.add(new Activation(t22, "P2_b3", TransitionOperation.AddElement, "P2_I"));
		t22.GuardMappingList.add(grdT22);

		t22.Delay = 0;
		pn.Transitions.add(t22);
		
		// T23
		//-----------------------------------------------------------------------------------------------------
		PetriTransition t23 = new PetriTransition(pn);
		t23.TransitionName = "T2_i4";
		t23.InputPlaceName.add("P2_b4");
		t23.InputPlaceName.add("P2_I");

		Condition T23Ct1 = new Condition(t23, "P2_b4", TransitionCondition.NotNull);
		Condition T23Ct2 = new Condition(t23, "P2_I", TransitionCondition.CanAddCars);
		T23Ct1.SetNextCondition(LogicConnector.AND, T23Ct2);

		GuardMapping grdT23 = new GuardMapping();
		grdT23.condition = T23Ct1;
		grdT23.Activations.add(new Activation(t23, "P2_b4", TransitionOperation.AddElement, "P2_I"));
		t23.GuardMappingList.add(grdT23);

		t23.Delay = 0;
		pn.Transitions.add(t23);
		
		// T24
		//----------------------------------------------------------------------------------------------------------------
		PetriTransition t24 = new PetriTransition(pn);
		t24.TransitionName = "T2_g1";
		t24.InputPlaceName.add("P2_I");
		t24.InputPlaceName.add("P2_o1");

		Condition T24Ct1 = new Condition(t24, "P2_I", TransitionCondition.HaveCarForMe);
		Condition T24Ct2 = new Condition(t24, "P2_o1", TransitionCondition.CanAddCars);
		T24Ct1.SetNextCondition(LogicConnector.AND, T24Ct2);

		GuardMapping grdT24 = new GuardMapping();
		grdT24.condition = T24Ct1;
		grdT24.Activations.add(new Activation(t24, "P2_I", TransitionOperation.PopElementWithTargetToQueue, "P2_o1"));
		t24.GuardMappingList.add(grdT24);

		t24.Delay = 0;
		pn.Transitions.add(t24);
		
		// T25
		//----------------------------------------------------------------------------------------------------------------
		PetriTransition t25 = new PetriTransition(pn);
		t25.TransitionName = "T2_g4";
		t25.InputPlaceName.add("P2_I");
		t25.InputPlaceName.add("P2_o4");

		Condition T25Ct1 = new Condition(t25, "P2_I", TransitionCondition.HaveCarForMe);
		Condition T25Ct2 = new Condition(t25, "P2_o4", TransitionCondition.CanAddCars);
		T25Ct1.SetNextCondition(LogicConnector.AND, T25Ct2);

		GuardMapping grdT25 = new GuardMapping();
		grdT25.condition = T25Ct1;
		grdT25.Activations.add(new Activation(t25, "P2_I", TransitionOperation.PopElementWithTargetToQueue, "P2_o4"));
		t25.GuardMappingList.add(grdT25);

		t25.Delay = 0;
		pn.Transitions.add(t25);
		
		// T26
		// -----------------------------------------------------------------------------------------------------

		PetriTransition t26 = new PetriTransition(pn);
		t26.TransitionName = "T_g4";
		t26.InputPlaceName.add("P2_I");
		t26.InputPlaceName.add("P_x4");

		Condition T26Ct1 = new Condition(t26, "P2_I", TransitionCondition.HaveCarForMe);
		Condition T26Ct2 = new Condition(t26, "P_x4", TransitionCondition.CanAddCars);
		T26Ct1.SetNextCondition(LogicConnector.AND, T26Ct2);
		
		//^
		Condition T26Ct3 = new Condition(t26, "P2_I", TransitionCondition.HaveCarForMe);
		Condition T26Ct4 = new Condition(t26, "P_x4", TransitionCondition.CanNotAddCars);
		T26Ct3.SetNextCondition(LogicConnector.AND, T26Ct4);
		//^

		GuardMapping grdT26 = new GuardMapping();
		grdT26.condition = T26Ct1;
		grdT26.Activations.add(new Activation(t26, "P2_I", TransitionOperation.PopElementWithTargetToQueue, "P_x4"));
		t26.GuardMappingList.add(grdT26);
		
		//^
		GuardMapping grdT26o = new GuardMapping();
		grdT26o.condition = T26Ct3;
		grdT26o.Activations.add(new Activation(t26, "full", TransitionOperation.SendOverNetwork, "OP26"));
		grdT26o.Activations.add(new Activation(t26, "P2_I", TransitionOperation.Move, "P2_I"));
		t26.GuardMappingList.add(grdT26o);
		//^

		t26.Delay = 0;
		pn.Transitions.add(t26);
		
		// T27
		// -----------------------------------------------------------------------------------------------------
		PetriTransition t27 = new PetriTransition(pn);
		t27.TransitionName = "T2_i2";
		t27.InputPlaceName.add("P2_b2");
		t27.InputPlaceName.add("P2_I");

		Condition T27Ct1 = new Condition(t27, "P2_b2", TransitionCondition.NotNull);
		Condition T27Ct2 = new Condition(t27, "P2_I", TransitionCondition.CanAddCars);
		T27Ct1.SetNextCondition(LogicConnector.AND, T27Ct2);

		GuardMapping grdT27 = new GuardMapping();
		grdT27.condition = T27Ct1;
		grdT27.Activations.add(new Activation(t27, "P2_b2", TransitionOperation.AddElement, "P2_I"));
		t27.GuardMappingList.add(grdT27);

		t27.Delay = 0;
		pn.Transitions.add(t27);
		

        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Exp1 started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
	}

}

