package com.jasper.bicolorstorm;

import java.util.ArrayList;
import java.util.List;

import android.R.integer;
import android.graphics.Color;

public class ConstantData {
	public static List colorDataList;
	public static List stepDataList;

	/*
	 * public int colorArray[] = { 0xFFFFFF99, // µ­»Æ Color.rgb(254, 67, 101),
	 * Color.rgb(252, 157, 154), Color.rgb(249, 205, 173), Color.rgb(200, 200,
	 * 169), Color.rgb(130, 57, 53), Color.rgb(137, 190, 178), Color.rgb(201,
	 * 186, 131), Color.rgb(222, 211, 140), Color.rgb(3, 35, 14), Color.rgb(64,
	 * 116, 52), Color.rgb(101, 147, 74), Color.rgb(160, 191, 124) };
	 */
	private void initColor() {
		// init color data list
		colorDataList = new ArrayList<int[][]>();
				colorDataList.add(colorData1);
				colorDataList.add(colorData2);
				colorDataList.add(colorData3);
				colorDataList.add(colorData4);
				colorDataList.add(colorData5);
				colorDataList.add(colorData6);
				colorDataList.add(colorData7);
				colorDataList.add(colorData8);
				colorDataList.add(colorData9);
				colorDataList.add(colorData10);
				colorDataList.add(colorData11);
				colorDataList.add(colorData12);
				colorDataList.add(colorData13);
				colorDataList.add(colorData14);
				colorDataList.add(colorData15);
				colorDataList.add(colorData16);
				colorDataList.add(colorData17);
				colorDataList.add(colorData18);
				colorDataList.add(colorData19);
				colorDataList.add(colorData20);
				colorDataList.add(colorData21);
				colorDataList.add(colorData22);
				colorDataList.add(colorData23);
				colorDataList.add(colorData24);
				colorDataList.add(colorData25);
				colorDataList.add(colorData26);
				colorDataList.add(colorData27);
				colorDataList.add(colorData28);
				colorDataList.add(colorData29);
				colorDataList.add(colorData30);
				colorDataList.add(colorData31);
				colorDataList.add(colorData32);
				colorDataList.add(colorData33);
				colorDataList.add(colorData34);
				colorDataList.add(colorData35);
				colorDataList.add(colorData36);
				colorDataList.add(colorData37);
				colorDataList.add(colorData38);
				colorDataList.add(colorData39);
				colorDataList.add(colorData40);
				colorDataList.add(colorData41);
				colorDataList.add(colorData42);
				colorDataList.add(colorData43);
				colorDataList.add(colorData44);
				colorDataList.add(colorData45);
				colorDataList.add(colorData46);
				colorDataList.add(colorData47);
				colorDataList.add(colorData48);
				colorDataList.add(colorData49);
				colorDataList.add(colorData50);
				colorDataList.add(colorData51);
				colorDataList.add(colorData52);
				colorDataList.add(colorData53);
				colorDataList.add(colorData54);
				colorDataList.add(colorData55);
				colorDataList.add(colorData56);
				colorDataList.add(colorData57);
				colorDataList.add(colorData58);
				colorDataList.add(colorData59);
				colorDataList.add(colorData60);
				colorDataList.add(colorData61);
				colorDataList.add(colorData62);
				colorDataList.add(colorData63);
				colorDataList.add(colorData64);
				colorDataList.add(colorData65);
				colorDataList.add(colorData66);
				colorDataList.add(colorData67);
				colorDataList.add(colorData68);
				colorDataList.add(colorData69);
				colorDataList.add(colorData70);
				colorDataList.add(colorData71);
				colorDataList.add(colorData72);
				colorDataList.add(colorData73);
				colorDataList.add(colorData74);
				colorDataList.add(colorData75);
				colorDataList.add(colorData76);
				colorDataList.add(colorData77);
				colorDataList.add(colorData78);
				colorDataList.add(colorData79);
				colorDataList.add(colorData80);
				colorDataList.add(colorData81);
				colorDataList.add(colorData82);
				colorDataList.add(colorData83);
				colorDataList.add(colorData84);
				colorDataList.add(colorData85);
				colorDataList.add(colorData86);
				colorDataList.add(colorData87);
				colorDataList.add(colorData88);
				colorDataList.add(colorData89);
				colorDataList.add(colorData90);
				colorDataList.add(colorData91);
				colorDataList.add(colorData92);
				colorDataList.add(colorData93);
				colorDataList.add(colorData94);
				colorDataList.add(colorData95);
				colorDataList.add(colorData96);
				colorDataList.add(colorData97);
				colorDataList.add(colorData98);
				colorDataList.add(colorData99);
				colorDataList.add(colorData100);
				colorDataList.add(colorData101);
				colorDataList.add(colorData102);
				colorDataList.add(colorData103);
				colorDataList.add(colorData104);
				colorDataList.add(colorData105);
				colorDataList.add(colorData106);
				colorDataList.add(colorData107);
				colorDataList.add(colorData108);
				colorDataList.add(colorData109);
				colorDataList.add(colorData110);
				colorDataList.add(colorData111);
				colorDataList.add(colorData112);
				colorDataList.add(colorData113);
				colorDataList.add(colorData114);
				colorDataList.add(colorData115);
				colorDataList.add(colorData116);
				colorDataList.add(colorData117);
				colorDataList.add(colorData118);
				colorDataList.add(colorData119);
				colorDataList.add(colorData120);
				colorDataList.add(colorData121);
				colorDataList.add(colorData122);
				colorDataList.add(colorData123);
				colorDataList.add(colorData124);
				colorDataList.add(colorData125);
				colorDataList.add(colorData126);
				colorDataList.add(colorData127);
				colorDataList.add(colorData128);
				colorDataList.add(colorData129);
				colorDataList.add(colorData130);
				colorDataList.add(colorData131);
				colorDataList.add(colorData132);
				colorDataList.add(colorData133);
				colorDataList.add(colorData134);
				colorDataList.add(colorData135);
				colorDataList.add(colorData136);
				colorDataList.add(colorData137);
				colorDataList.add(colorData138);
				colorDataList.add(colorData139);
				colorDataList.add(colorData140);
				colorDataList.add(colorData141);
				colorDataList.add(colorData142);
				colorDataList.add(colorData143);
				colorDataList.add(colorData144);
				colorDataList.add(colorData145);
				colorDataList.add(colorData146);
				colorDataList.add(colorData147);
				colorDataList.add(colorData148);
				colorDataList.add(colorData149);
				colorDataList.add(colorData150);
				colorDataList.add(colorData151);
				colorDataList.add(colorData152);
				colorDataList.add(colorData153);
				colorDataList.add(colorData154);
				colorDataList.add(colorData155);
				colorDataList.add(colorData156);
				colorDataList.add(colorData157);
				colorDataList.add(colorData158);
				colorDataList.add(colorData159);
				colorDataList.add(colorData160);
				colorDataList.add(colorData161);
				colorDataList.add(colorData162);
				colorDataList.add(colorData163);
				colorDataList.add(colorData164);
				colorDataList.add(colorData165);
				colorDataList.add(colorData166);
				colorDataList.add(colorData167);
				colorDataList.add(colorData168);
				colorDataList.add(colorData169);
				colorDataList.add(colorData170);
				colorDataList.add(colorData171);
				colorDataList.add(colorData172);
				colorDataList.add(colorData173);
				colorDataList.add(colorData174);
				colorDataList.add(colorData175);
				colorDataList.add(colorData176);
				colorDataList.add(colorData177);
				colorDataList.add(colorData178);
				colorDataList.add(colorData179);
				colorDataList.add(colorData180);
	}
	
	private void initStep() {
stepDataList = new ArrayList<int[][]>();

		

		// init step data list
		stepDataList.add(stepData1);
		stepDataList.add(stepData2);
		stepDataList.add(stepData3);
		stepDataList.add(stepData4);
		stepDataList.add(stepData5);
		stepDataList.add(stepData6);
		stepDataList.add(stepData7);
		stepDataList.add(stepData8);
		stepDataList.add(stepData9);
		stepDataList.add(stepData10);
		stepDataList.add(stepData11);
		stepDataList.add(stepData12);
		stepDataList.add(stepData13);
		stepDataList.add(stepData14);
		stepDataList.add(stepData15);
		stepDataList.add(stepData16);
		stepDataList.add(stepData17);
		stepDataList.add(stepData18);
		stepDataList.add(stepData19);
		stepDataList.add(stepData20);
		stepDataList.add(stepData21);
		stepDataList.add(stepData22);
		stepDataList.add(stepData23);
		stepDataList.add(stepData24);
		stepDataList.add(stepData25);
		stepDataList.add(stepData26);
		stepDataList.add(stepData27);
		stepDataList.add(stepData28);
		stepDataList.add(stepData29);
		stepDataList.add(stepData30);
		stepDataList.add(stepData31);
		stepDataList.add(stepData32);
		stepDataList.add(stepData33);
		stepDataList.add(stepData34);
		stepDataList.add(stepData35);
		stepDataList.add(stepData36);
		stepDataList.add(stepData37);
		stepDataList.add(stepData38);
		stepDataList.add(stepData39);
		stepDataList.add(stepData40);
		stepDataList.add(stepData41);
		stepDataList.add(stepData42);
		stepDataList.add(stepData43);
		stepDataList.add(stepData44);
		stepDataList.add(stepData45);
		stepDataList.add(stepData46);
		stepDataList.add(stepData47);
		stepDataList.add(stepData48);
		stepDataList.add(stepData49);
		stepDataList.add(stepData50);
		stepDataList.add(stepData51);
		stepDataList.add(stepData52);
		stepDataList.add(stepData53);
		stepDataList.add(stepData54);
		stepDataList.add(stepData55);
		stepDataList.add(stepData56);
		stepDataList.add(stepData57);
		stepDataList.add(stepData58);
		stepDataList.add(stepData59);
		stepDataList.add(stepData60);
		stepDataList.add(stepData61);
		stepDataList.add(stepData62);
		stepDataList.add(stepData63);
		stepDataList.add(stepData64);
		stepDataList.add(stepData65);
		stepDataList.add(stepData66);
		stepDataList.add(stepData67);
		stepDataList.add(stepData68);
		stepDataList.add(stepData69);
		stepDataList.add(stepData70);
		stepDataList.add(stepData71);
		stepDataList.add(stepData72);
		stepDataList.add(stepData73);
		stepDataList.add(stepData74);
		stepDataList.add(stepData75);
		stepDataList.add(stepData76);
		stepDataList.add(stepData77);
		stepDataList.add(stepData78);
		stepDataList.add(stepData79);
		stepDataList.add(stepData80);
		stepDataList.add(stepData81);
		stepDataList.add(stepData82);
		stepDataList.add(stepData83);
		stepDataList.add(stepData84);
		stepDataList.add(stepData85);
		stepDataList.add(stepData86);
		stepDataList.add(stepData87);
		stepDataList.add(stepData88);
		stepDataList.add(stepData89);
		stepDataList.add(stepData90);
		stepDataList.add(stepData91);
		stepDataList.add(stepData92);
		stepDataList.add(stepData93);
		stepDataList.add(stepData94);
		stepDataList.add(stepData95);
		stepDataList.add(stepData96);
		stepDataList.add(stepData97);
		stepDataList.add(stepData98);
		stepDataList.add(stepData99);
		stepDataList.add(stepData100);
		stepDataList.add(stepData101);
		stepDataList.add(stepData102);
		stepDataList.add(stepData103);
		stepDataList.add(stepData104);
		stepDataList.add(stepData105);
		stepDataList.add(stepData106);
		stepDataList.add(stepData107);
		stepDataList.add(stepData108);
		stepDataList.add(stepData109);
		stepDataList.add(stepData110);
		stepDataList.add(stepData111);
		stepDataList.add(stepData112);
		stepDataList.add(stepData113);
		stepDataList.add(stepData114);
		stepDataList.add(stepData115);
		stepDataList.add(stepData116);
		stepDataList.add(stepData117);
		stepDataList.add(stepData118);
		stepDataList.add(stepData119);
		stepDataList.add(stepData120);
		stepDataList.add(stepData121);
		stepDataList.add(stepData122);
		stepDataList.add(stepData123);
		stepDataList.add(stepData124);
		stepDataList.add(stepData125);
		stepDataList.add(stepData126);
		stepDataList.add(stepData127);
		stepDataList.add(stepData128);
		stepDataList.add(stepData129);
		stepDataList.add(stepData130);
		stepDataList.add(stepData131);
		stepDataList.add(stepData132);
		stepDataList.add(stepData133);
		stepDataList.add(stepData134);
		stepDataList.add(stepData135);
		stepDataList.add(stepData136);
		stepDataList.add(stepData137);
		stepDataList.add(stepData138);
		stepDataList.add(stepData139);
		stepDataList.add(stepData140);
		stepDataList.add(stepData141);
		stepDataList.add(stepData142);
		stepDataList.add(stepData143);
		stepDataList.add(stepData144);
		stepDataList.add(stepData145);
		stepDataList.add(stepData146);
		stepDataList.add(stepData147);
		stepDataList.add(stepData148);
		stepDataList.add(stepData149);
		stepDataList.add(stepData150);
		stepDataList.add(stepData151);
		stepDataList.add(stepData152);
		stepDataList.add(stepData153);
		stepDataList.add(stepData154);
		stepDataList.add(stepData155);
		stepDataList.add(stepData156);
		stepDataList.add(stepData157);
		stepDataList.add(stepData158);
		stepDataList.add(stepData159);
		stepDataList.add(stepData160);
		 stepDataList.add(stepData161);
		 stepDataList.add(stepData162);
		 stepDataList.add(stepData163);
		 stepDataList.add(stepData164);
		 stepDataList.add(stepData165);
		 stepDataList.add(stepData166);
		 stepDataList.add(stepData167);
		 stepDataList.add(stepData168);
		 stepDataList.add(stepData169);
		 stepDataList.add(stepData170);
		 stepDataList.add(stepData171);
		 stepDataList.add(stepData172);
		 stepDataList.add(stepData173);
		 stepDataList.add(stepData174);
		 stepDataList.add(stepData175);
		 stepDataList.add(stepData176);
		 stepDataList.add(stepData177);
		 stepDataList.add(stepData178);
		 stepDataList.add(stepData179);
		 stepDataList.add(stepData180);
	}
	public ConstantData() {
		
		initColor();
		initStep();
	}

	// level 1
	private final int colorData1[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData1[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 2
	private final int colorData2[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData2[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 13, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 3
	private final int colorData3[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData3[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 5, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 4
	private final int colorData4[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData4[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 3, 3, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 5
	private final int colorData5[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData5[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 0, 0, 0 }, { 0, 0, 0, 0, 6, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 6
	private final int colorData6[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData6[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 10, 0, 0 },
			{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 7
	private final int colorData7[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData7[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 8
	private final int colorData8[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData8[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 2, 3, 3, 2, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 2, 3, 3, 2, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 9
	private final int colorData9[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData9[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 5, 0, 0 },
			{ 0, 0, 5, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 10
	private final int colorData10[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData10[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 0, 0, 0 },
			{ 0, 1, 2, 2, 1, 0 }, { 0, 0, 0, 0, 3, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 11
	private final int colorData11[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData11[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 4, 9, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 9, 4, 0, 3, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 12
	private final int colorData12[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData12[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 4, 0, 0, 3, 0 }, { 0, 3, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 3, 0 }, { 0, 3, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 13
	private final int colorData13[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData13[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 2, 0 }, { 0, 0, 3, 0, 0, 0 },
			{ 0, 0, 1, 1, 2, 0 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 14
	private final int colorData14[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData14[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 2, 0 },
			{ 0, 0, 0, 2, 0, 2 }, { 0, 0, 0, 0, 0, 0 } };
	// level 15
	private final int colorData15[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData15[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 2, 2, 2, 2, 0 }, { 0, 0, 2, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 2
	// level 16
	private final int colorData16[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData16[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 23, 0, 0, 7, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 17
	private final int colorData17[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 0, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData17[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 5, 0, 0 }, { 0, 0, 2, 0, 3, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 2, 0, 0 }, { 0, 0, 5, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 18
	private final int colorData18[][] = { { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData18[][] = { { 0, 0, 21, 8, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 2, 0, 0 },
			{ 0, 0, 2, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 19
	private final int colorData19[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData19[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 4, 7, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 3, 2, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 20
	private final int colorData20[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1, 0 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData20[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 },
			{ 0, 0, 0, 3, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 6, 0, 6, 4 },
			{ 0, 9, 3, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 21
	private final int colorData21[][] = { { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 } };
	private final int stepData21[][] = { { 0, 0, 0, 7, 4, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 10 }, { 0, 0, 0, 0, 0, 7 } };
	// level 22
	private final int colorData22[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData22[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 5 },
			{ 4, 0, 8, 8, 0, 4 }, { 5, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 38
	private final int colorData23[][] = { { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 } };
	private final int stepData23[][] = { { 0, 4, 8, 0, 4, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 },
			{ 0, 0, 5, 5, 0, 0 }, { 0, 2, 3, 3, 2, 0 } };
	// level 24
	private final int colorData24[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData24[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 4, 4, 0, 0 },
			{ 0, 0, 0, 3, 0, 0 }, { 0, 0, 0, 10, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 25
	private final int colorData25[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData25[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 2, 0, 0, 2, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 2, 0, 0 }, { 0, 2, 2, 2, 2, 0 }, { 0, 2, 0, 0, 2, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 26
	private final int colorData26[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 1, 1, 0, 0, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData26[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 2, 0 },
			{ 0, 0, 0, 0, 9, 0 }, { 0, 5, 3, 0, 6, 0 }, { 0, 0, 3, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 27
	private final int colorData27[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData27[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 0, 0, 0 }, { 0, 0, 0, 0, 7, 0 },
			{ 0, 0, 0, 0, 0, 3 }, { 0, 6, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 28
	private final int colorData28[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 },
			{ 1, 0, 1, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData28[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 5 }, { 0, 0, 0, 0, 0, 7 },
			{ 0, 0, 0, 0, 0, 0 }, { 7, 0, 0, 0, 0, 0 }, { 5, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 29
	private final int colorData29[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 0, 0, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData29[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 5, 0, 0, 5, 0, 0 }, { 3, 6, 7, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 30
	private final int colorData30[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 0, 1, 0, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData30[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 5, 0, 4, 0 }, { 0, 0, 0, 3, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 9, 1, 0, 0, 0 }, { 0, 4, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// 3
	// level 31
	private final int colorData31[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData31[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 6, 0, 0, 0, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 32
	private final int colorData32[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData32[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 2, 0, 0, 0, 0, 2 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 4, 0, 0, 0 },
			{ 0, 0, 0, 3, 0, 5 }, { 0, 0, 0, 0, 2, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 2, 0, 0, 0, 0, 2 }, { 0, 0, 0, 0, 0, 0 } };
	// level 33
	private final int colorData33[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData33[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 0, 0, 3 }, { 0, 0, 0, 0, 2, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 7 }, { 0, 5, 0, 0, 0, 6 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0 } };
	// level 34
	private final int colorData34[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 1, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData34[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 3, 0, 0, 2, 3, 0 }, { 0, 0, 2, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 4, 0, 0, 0, 0, 8 }, { 0, 0, 2, 0, 0, 0 },
			{ 0, 0, 0, 2, 3, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 35
	private final int colorData35[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData35[][] = { { 0, 3, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 6, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 0, 3, 0 }, { 0, 0, 0, 3, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 7, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 3, 0 } };
	// level 36
	private final int colorData36[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData36[][] = { { 0, 0, 0, 0, 4, 0 },
			{ 0, 0, 0, 0, 0, 5 }, { 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 3, 0, 2, 0 }, { 3, 0, 0, 5, 0, 0 }, { 0, 0, 0, 7, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 0, 0, 0 } };
	// level 37
	private final int colorData37[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData37[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 6, 4, 2, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 2, 0, 0 },
			{ 0, 0, 0, 4, 0, 0 }, { 0, 0, 0, 6, 0, 0 }, { 0, 0, 0, 8, 0, 0 },
			{ 0, 0, 0, 0, 9, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 38
	private final int colorData38[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData38[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 5, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 5 }, { 0, 0, 2, 5, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 2, 0, 0 }, { 5, 0, 0, 0, 0, 0 },
			{ 13, 0, 2, 0, 5, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 39
	private final int colorData39[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData39[][] = { { 8, 0, 0, 0, 0, 0 },
			{ 0, 9, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 4, 4, 8, 0 },
			{ 0, 0, 0, 0, 0, 4 }, { 0, 0, 0, 0, 0, 0 }, { 0, 3, 9, 0, 7, 0 },
			{ 0, 0, 0, 0, 0, 3 }, { 7, 0, 0, 0, 0, 0 } };
	// level 40
	private final int colorData40[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 1, 0 },
			{ 1, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0, 0 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData40[][] = { { 0, 4, 0, 0, 0, 0 },
			{ 3, 0, 5, 0, 0, 0 }, { 0, 4, 0, 0, 0, 0 }, { 0, 4, 0, 0, 6, 0 },
			{ 3, 4, 0, 0, 0, 0 }, { 0, 4, 0, 0, 6, 0 }, { 5, 4, 5, 0, 0, 0 },
			{ 0, 6, 5, 0, 0, 0 }, { 0, 3, 0, 0, 0, 0 } };
	// level 41
	private final int colorData41[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData41[][] = { { 1, 3, 5, 0, 7, 0 },
			{ 0, 1, 6, 0, 6, 0 }, { 0, 3, 4, 0, 4, 0 }, { 0, 5, 2, 0, 2, 0 },
			{ 0, 11, 11, 11, 11, 0 }, { 0, 2, 0, 2, 5, 0 },
			{ 0, 4, 0, 4, 3, 0 }, { 0, 6, 0, 6, 1, 0 }, { 0, 7, 0, 5, 3, 1 } };
	// level 42
	private final int colorData42[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 1, 1 }, { 0, 1, 0, 1, 1, 1 },
			{ 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData42[][] = { { 9, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 7 }, { 0, 0, 0, 6, 5, 0 }, { 0, 0, 0, 0, 0, 4 },
			{ 0, 10, 0, 0, 9, 7 }, { 0, 6, 3, 0, 0, 0 }, { 0, 0, 0, 5, 0, 5 },
			{ 5, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 12 } };
	// level 43
	private final int colorData43[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData43[][] = { { 4, 5, 0, 0, 0, 0 },
			{ 0, 2, 4, 0, 0, 7 }, { 4, 0, 0, 0, 0, 0 }, { 3, 11, 0, 0, 6, 0 },
			{ 0, 4, 0, 0, 0, 0 }, { 3, 11, 0, 0, 6, 0 }, { 4, 0, 0, 0, 0, 0 },
			{ 0, 2, 4, 0, 0, 7 }, { 3, 5, 0, 0, 0, 0 } };
	// level 44
	private final int colorData44[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData44[][] = { { 12, 11, 0, 0, 0, 0 },
			{ 5, 0, 6, 0, 0, 0 }, { 0, 0, 0, 15, 0, 0 }, { 0, 0, 0, 0, 7, 0 },
			{ 0, 0, 0, 0, 0, 16 }, { 0, 0, 9, 2, 0, 0 }, { 0, 0, 0, 0, 0, 5 },
			{ 9, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 45
	private final int colorData45[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 1, 1 }, { 0, 1, 0, 1, 1, 1 },
			{ 0, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData45[][] = { { 17, 0, 0, 0, 0, 0 },
			{ 0, 4, 0, 0, 4, 5 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 5, 0, 3, 0 },
			{ 0, 4, 0, 0, 0, 0 }, { 5, 0, 4, 0, 3, 0 }, { 0, 0, 0, 0, 0, 5 },
			{ 0, 4, 0, 0, 4, 5 }, { 17, 0, 0, 0, 0, 0 } };
	// level 4
	// level 46
	private final int colorData46[][] = { { 1, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 } };
	private final int stepData46[][] = { { 17, 0, 0, 0, 0, 8 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 8, 0, 0, 0, 0, 17 } };
	// level 47
	private final int colorData47[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 1, 1, 1 },
			{ 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData47[][] = { { 5, 0, 0, 0, 0, 8 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 8, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 8, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 8, 0, 0, 0, 0, 5 } };
	// level 48
	private final int colorData48[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData48[][] = { { 0, 0, 11, 0, 0, 0 },
			{ 0, 0, 4, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 5, 0, 0, 0 },
			{ 0, 0, 6, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 49
	private final int colorData49[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData49[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 4, 8 }, { 0, 0, 0, 9, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 50
	private final int colorData50[][] = { { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData50[][] = { { 0, 0, 5, 0, 0, 0 },
			{ 0, 0, 13, 0, 0, 0 }, { 0, 7, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 3, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 8, 16, 8, 0, 0 } };
	// level 51
	private final int colorData51[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData51[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 7 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 24 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 52
	private final int colorData52[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 } };
	private final int stepData52[][] = { { 0, 0, 0, 0, 0, 14 },
			{ 0, 0, 0, 0, 0, 0 }, { 9, 0, 0, 0, 0, 10 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 8, 11, 0, 0, 0, 0 } };
	// level 53
	private final int colorData53[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData53[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 0, 0, 6, 0 },
			{ 0, 0, 6, 0, 0, 6 }, { 0, 0, 0, 8, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 54
	private final int colorData54[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData54[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 5, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 10, 4 },
			{ 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 10 } };
	// level 55
	private final int colorData55[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData55[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 0, 0, 0 }, { 0, 8, 0, 7, 13, 0 },
			{ 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 56
	private final int colorData56[][] = { { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 } };
	private final int stepData56[][] = { { 0, 0, 0, 3, 7, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 11, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 3, 3, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 11, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 7, 3, 0, 0, 0 } };
	// level 57
	private final int colorData57[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0 }, { 0, 1, 1, 0, 0, 0 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData57[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 4, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 }, { 10, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 6, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 4, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 58
	private final int colorData58[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData58[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 3, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 2, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 5, 0, 0 }, { 0, 0, 0, 6, 8, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 59
	private final int colorData59[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData59[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 4, 0 }, { 0, 0, 9, 2, 5, 0 },
			{ 0, 0, 0, 0, 4, 0 }, { 0, 0, 7, 0, 7, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 60
	private final int colorData60[][] = { { 0, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0 } };
	private final int stepData60[][] = { { 7, 0, 0, 0, 5, 34 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 4, 0, 0, 0, 0, 3 } };

	// level 5
	// level 61
	private final int colorData61[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 } };
	private final int stepData61[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 29, 0, 0, 0, 0, 16 } };
	// level 62
	private final int colorData62[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 1, 0, 0 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 0, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData62[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 14, 0 }, { 34, 0, 0, 0, 0, 0 } };
	// level 63
	private final int colorData63[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 0, 1, 0, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData63[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 3, 0, 0 }, { 0, 0, 7, 4, 5, 0 },
			{ 0, 0, 4, 5, 2, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 64
	private final int colorData64[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData64[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 7, 0, 0, 0, 0 },
			{ 0, 0, 3, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 }, { 0, 0, 0, 0, 2, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 6, 5, 4, 3, 2, 1 } };
	// level 65
	private final int colorData65[][] = { { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData65[][] = { { 0, 0, 0, 3, 0, 0 },
			{ 0, 0, 0, 16, 0, 0 }, { 0, 0, 0, 7, 0, 0 }, { 0, 0, 0, 7, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 16, 0, 0 }, { 0, 0, 0, 7, 0, 0 },
			{ 0, 0, 0, 6, 0, 0 }, { 0, 0, 0, 3, 0, 0 } };
	// level 66
	private final int colorData66[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData66[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 10, 0, 0, 0 }, { 0, 0, 0, 0, 3, 0 },
			{ 0, 10, 0, 3, 0, 0 }, { 0, 0, 0, 3, 0, 0 }, { 0, 0, 3, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 67
	private final int colorData67[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData67[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 9, 0 }, { 0, 13, 0, 0, 0, 0 }, { 0, 0, 8, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 68
	private final int colorData68[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData68[][] = { { 1, 2, 3, 4, 5, 6 },
			{ 6, 1, 0, 0, 1, 6 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 8, 6, 7, 0, 0, 0 }, { 6, 5, 4, 3, 2, 1 } };
	// level 69
	private final int colorData69[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 } };
	private final int stepData69[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 3, 3, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 5, 0, 0, 0, 0 }, { 0, 2, 13, 0, 0, 0 } };
	// level 70
	private final int colorData70[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 0, 1, 0 }, { 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData70[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 7, 0, 0, 3, 0 }, { 4, 0, 0, 0, 0, 12 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 6, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 0, 3, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 71
	private final int colorData71[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 1, 0 }, { 0, 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData71[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 7, 6, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 4, 0, 0, 3, 4 }, { 4, 3, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 6, 7 }, { 0, 0, 0, 0, 0, 0 } };
	// level 72
	private final int colorData72[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData72[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 0, 0, 0 }, { 7, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 5, 0 }, { 0, 0, 0, 0, 0, 7 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 73
	private final int colorData73[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 0, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 } };
	private final int stepData73[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 4, 2, 0, 2, 0 }, { 0, 0, 0, 0, 0, 5 },
			{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 2, 0, 0, 0 }, { 5, 0, 0, 0, 0, 0 },
			{ 0, 2, 0, 2, 4, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 74
	private final int colorData74[][] = { { 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 } };
	private final int stepData74[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 13, 8, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 10, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 9, 0, 0, 0, 0, 0 }, { 13, 0, 0, 0, 0, 0 } };
	// level 75
	private final int colorData75[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData75[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 6, 3, 3, 6, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 5, 5, 0, 0 }, { 0, 0, 5, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 6, 3, 3, 6, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 6
	// level 76
	private final int colorData76[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1} };
	private final int stepData76[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 7, 0, 0, 7, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 14, 0, 0, 0, 0, 14}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 7, 7, 0, 0} };
	// level 77
	private final int colorData77[][] = { { 0, 1, 1, 1, 1, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 0, 1, 1, 1, 1, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1} };
	private final int stepData77[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 1, 0, 0, 0, 0, 1}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 1, 0, 2, 2, 0, 1}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 2, 0, 0, 2, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 0, 0, 3, 3, 0, 0} };
	// level 78
	private final int colorData78[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 0, 0, 0, 0, 0, 0} };
	private final int stepData78[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 7, 0, 0, 6}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 3, 0}, 
	{ 3, 0, 0, 0, 0, 3}, 
	{ 0, 3, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 6, 0, 0, 7, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0} };
	// level 79
	private final int colorData79[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 1, 0, 1, 1, 0}, 
	{ 0, 1, 0, 1, 1, 1}, 
	{ 0, 1, 0, 1, 1, 1}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 1, 1, 1, 0, 1, 0}, 
	{ 1, 1, 1, 0, 1, 0}, 
	{ 0, 1, 1, 0, 1, 0}, 
	{ 0, 0, 0, 0, 0, 0} };
	private final int stepData79[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 8, 0, 0}, 
	{ 0, 0, 0, 0, 0, 16}, 
	{ 0, 7, 2, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 7}, 
	{ 16, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 8, 0, 0} };
	// level 80
	private final int colorData80[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 0, 1, 1}, 
	{ 1, 1, 0, 1, 0, 1}, 
	{ 1, 0, 1, 1, 1, 0}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 1, 0, 1, 0, 1, 1}, 
	{ 1, 1, 0, 1, 1, 1}, 
	{ 1, 1, 1, 0, 1, 0}, 
	{ 1, 1, 1, 1, 0, 1} };
	private final int stepData80[][] = { { 0, 0, 0, 1, 0, 0}, 
	{ 0, 0, 1, 1, 1, 0}, 
	{ 0, 1, 0, 0, 0, 1}, 
	{ 0, 0, 0, 1, 1, 0}, 
	{ 0, 0, 0, 1, 0, 0}, 
	{ 1, 0, 1, 0, 0, 0}, 
	{ 0, 1, 1, 0, 1, 1}, 
	{ 0, 0, 1, 0, 1, 0}, 
	{ 0, 0, 0, 1, 0, 0} };
	// level 81
	private final int colorData81[][] = { { 1, 1, 0, 1, 1, 1}, 
	{ 1, 0, 0, 0, 1, 1}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 0, 1, 0, 1, 0, 0}, 
	{ 0, 1, 1, 1, 0, 1} };
	private final int stepData81[][] = { { 0, 1, 0, 1, 0, 0}, 
	{ 7, 0, 0, 0, 7, 0}, 
	{ 0, 3, 0, 4, 0, 0}, 
	{ 0, 0, 1, 0, 0, 0}, 
	{ 0, 0, 0, 1, 0, 4}, 
	{ 3, 2, 0, 0, 0, 0}, 
	{ 2, 0, 4, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 8, 0, 4, 1} };
	// level 82
	private final int colorData82[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 1, 1, 1, 1, 1, 1}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 1, 1, 1, 1, 1, 1} };
	private final int stepData82[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 15}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 2, 0, 0, 3}, 
	{ 1, 2, 3, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 6} };
	// level 83
	private final int colorData83[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 0, 1, 0, 0, 0, 1}, 
	{ 1, 0, 0, 0, 0, 1}, 
	{ 0, 1, 1, 0, 1, 0}, 
	{ 0, 1, 1, 0, 1, 0}, 
	{ 0, 1, 1, 0, 0, 0}, 
	{ 0, 1, 1, 0, 1, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 0, 0, 1, 0, 1, 0} };
	private final int stepData83[][] = { { 1, 0, 3, 1, 1, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 6, 1, 0, 0, 0, 6}, 
	{ 0, 0, 0, 0, 1, 0}, 
	{ 0, 0, 0, 3, 1, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 14, 0, 0, 0, 0}, 
	{ 0, 0, 0, 1, 0, 0} };
	// level 84
	private final int colorData84[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 0}, 
	{ 1, 1, 1, 1, 0, 1}, 
	{ 1, 1, 1, 0, 1, 1}, 
	{ 0, 1, 0, 1, 1, 1}, 
	{ 1, 0, 1, 1, 1, 1}, 
	{ 0, 1, 0, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1} };
	private final int stepData84[][] = { { 0, 0, 0, 0, 0, 1}, 
	{ 0, 0, 0, 0, 1, 0}, 
	{ 0, 0, 0, 1, 0, 0}, 
	{ 3, 0, 1, 5, 0, 0}, 
	{ 0, 0, 1, 0, 0, 0}, 
	{ 0, 1, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 1, 0, 2, 0, 0, 5}, 
	{ 0, 0, 0, 0, 0, 0} };
	// level 85
	private final int colorData85[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 1, 0, 1}, 
	{ 0, 0, 1, 0, 1, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 1, 0, 1, 1, 1}, 
	{ 1, 0, 1, 0, 1, 1}, 
	{ 0, 1, 1, 1, 0, 1}, 
	{ 1, 0, 1, 0, 1, 1}, 
	{ 1, 1, 0, 1, 1, 1} };
	private final int stepData85[][] = { { 0, 0, 0, 0, 1, 0}, 
	{ 5, 0, 0, 3, 0, 1}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 1, 0, 1, 0}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 1, 0, 0, 0, 1, 0}, 
	{ 0, 1, 0, 1, 0, 0}, 
	{ 0, 0, 1, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0} };
	// level 86
	private final int colorData86[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1}, 
	{ 1, 0, 1, 0, 1, 0}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 1, 1, 1, 1, 1, 1}, 
	{ 1, 0, 1, 0, 1, 0}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1} };
	private final int stepData86[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 1, 0, 1, 0, 1}, 
	{ 1, 0, 1, 0, 1, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 3, 0, 0, 0, 0}, 
	{ 0, 1, 0, 1, 4, 0}, 
	{ 0, 0, 1, 0, 1, 3}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0} };
	// level 87
	private final int colorData87[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 0, 1, 1, 1, 1, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 0, 1, 1, 1, 1, 0}, 
	{ 1, 1, 1, 1, 1, 1} };
	private final int stepData87[][] = { { 3, 0, 0, 0, 0, 3}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 1, 0, 0, 1, 0}, 
	{ 0, 0, 2, 2, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 2, 0, 0, 2, 0}, 
	{ 0, 1, 3, 3, 1, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 3, 0, 0, 0, 0, 3} };
	// level 88
	private final int colorData88[][] = { { 1, 1, 0, 0, 1, 1}, 
	{ 1, 1, 0, 0, 1, 1}, 
	{ 1, 0, 0, 0, 0, 1}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1} };
	private final int stepData88[][] = { { 0, 2, 0, 0, 0, 0}, 
	{ 0, 16, 0, 0, 2, 0}, 
	{ 4, 0, 0, 0, 0, 4}, 
	{ 0, 2, 0, 0, 2, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 1, 1, 0, 0}, 
	{ 0, 0, 4, 4, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0} };
	// level 89
	private final int colorData89[][] = { { 0, 0, 1, 0, 0, 0}, 
	{ 0, 1, 1, 1, 1, 0}, 
	{ 1, 0, 0, 1, 1, 0}, 
	{ 1, 0, 1, 0, 1, 1}, 
	{ 1, 1, 0, 1, 1, 1}, 
	{ 1, 1, 1, 1, 0, 1}, 
	{ 0, 1, 1, 0, 0, 1}, 
	{ 0, 1, 1, 1, 1, 0}, 
	{ 0, 0, 1, 0, 0, 0} };
	private final int stepData89[][] = { { 0, 0, 0, 0, 0, 0}, 
	{ 0, 0, 0, 0, 0, 0}, 
	{ 3, 0, 0, 1, 0, 0}, 
	{ 0, 0, 0, 0, 1, 5}, 
	{ 0, 2, 0, 0, 5, 0}, 
	{ 5, 0, 1, 0, 0, 0}, 
	{ 0, 0, 1, 0, 0, 3}, 
	{ 0, 0, 0, 1, 0, 0}, 
	{ 0, 1, 0, 0, 3, 0} };

	private final int colorData90[][] = { { 1, 1, 1, 1, 1, 1}, 
	{ 1, 1, 0, 1, 1, 1}, 
	{ 1, 1, 1, 0, 1, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 1, 1, 1, 0, 1}, 
	{ 1, 0, 1, 1, 0, 1}, 
	{ 1, 1, 1, 0, 1, 1}, 
	{ 1, 1, 0, 1, 1, 1}, 
	{ 1, 1, 1, 1, 1, 1} };
	private final int stepData90[][] = { { 0, 0, 1, 0, 0, 0}, 
	{ 9, 0, 0, 1, 0, 0}, 
	{ 0, 1, 0, 2, 1, 0}, 
	{ 0, 0, 0, 0, 2, 0}, 
	{ 0, 0, 2, 0, 0, 1}, 
	{ 1, 0, 0, 2, 0, 0}, 
	{ 0, 0, 0, 0, 1, 0}, 
	{ 0, 0, 9, 1, 0, 0}, 
	{ 0, 0, 1, 0, 0, 0} };

	
	
	// level 7
	// level 91
	private final int colorData91[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData91[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 5, 0, 0 }, { 0, 0, 5, 0, 0, 0 },
			{ 0, 0, 10, 4, 0, 0 }, { 0, 0, 0, 6, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 92
	private final int colorData92[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData92[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 4, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 17, 0, 0 }, { 0, 0, 4, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 93
	private final int colorData93[][] = { { 0, 0, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 }, { 0, 1, 1, 1, 0, 1 }, { 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0 } };
	private final int stepData93[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 39, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 10, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 94
	private final int colorData94[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 0, 1 } };
	private final int stepData94[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 9, 0 }, { 0, 0, 7, 0, 0, 0 }, { 5, 0, 0, 33, 5, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 5 } };
	// level 95
	private final int colorData95[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData95[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 5, 0, 5 }, { 0, 0, 4, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 5, 0, 5, 0 }, { 0, 5, 0, 5, 0, 5 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 96
	private final int colorData96[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 1, 0 }, { 1, 0, 1, 1, 1, 0 },
			{ 1, 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData96[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 8, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 3, 0, 0, 11 }, { 0, 0, 0, 0, 0, 14 },
			{ 0, 0, 0, 10, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 97
	private final int colorData97[][] = { { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 } };
	private final int stepData97[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 8, 0, 0, 0, 0, 0 }, { 10, 6, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 0, 7, 14 },
			{ 0, 0, 0, 0, 0, 0 }, { 4, 0, 0, 0, 0, 0 } };
	// level 98
	private final int colorData98[][] = { { 0, 0, 0, 0, 1, 0 },
			{ 1, 1, 1, 0, 1, 0 }, { 0, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 1, 0 },
			{ 1, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1, 0 },
			{ 1, 1, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0 } };
	private final int stepData98[][] = { { 0, 0, 0, 0, 14, 0 },
			{ 17, 0, 0, 0, 0, 0 }, { 12, 0, 0, 0, 0, 0 }, { 0, 0, 4, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 8, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 99
	private final int colorData99[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData99[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 13, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 6 },
			{ 0, 0, 0, 0, 0, 18 }, { 0, 0, 0, 0, 0, 0 }, { 9, 0, 0, 0, 0, 0 },
			{ 14, 0, 0, 0, 0, 9 }, { 0, 0, 0, 0, 0, 0 } };
	// level 100
	private final int colorData100[][] = { { 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData100[][] = { { 6, 0, 0, 0, 0, 12 },
			{ 10, 0, 0, 0, 0, 0 }, { 10, 0, 0, 0, 0, 9 },
			{ 0, 0, 0, 0, 0, 21 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 12, 0, 0, 0, 0, 0 }, { 7, 0, 0, 0, 0, 0 } };
	// level 101
	private final int colorData101[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData101[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 6, 4, 0, 0 }, { 0, 0, 0, 0, 4, 0 }, { 0, 0, 4, 0, 0, 8 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 } };
	// level 102
	private final int colorData102[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData102[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 6, 0, 0, 6, 0 },
			{ 4, 5, 0, 0, 5, 4 }, { 0, 3, 4, 4, 3, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 103
	private final int colorData103[][] = { { 0, 0, 1, 1, 1, 1 },
			{ 0, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1 }, { 0, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0 } };
	private final int stepData103[][] = { { 0, 0, 2, 2, 0, 0 },
			{ 0, 0, 0, 0, 0, 5 }, { 0, 0, 2, 2, 0, 0 }, { 5, 0, 0, 0, 0, 5 },
			{ 0, 0, 2, 2, 0, 0 }, { 5, 0, 0, 0, 0, 5 }, { 0, 0, 2, 2, 0, 0 },
			{ 5, 0, 0, 0, 0, 5 }, { 0, 0, 2, 2, 0, 0 } };
	// level 104
	private final int colorData104[][] = { { 1, 1, 1, 0, 1, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData104[][] = { { 0, 0, 0, 2, 0, 0 },
			{ 0, 2, 0, 10, 3, 0 }, { 0, 0, 0, 2, 0, 0 }, { 0, 2, 0, 10, 3, 0 },
			{ 0, 0, 0, 2, 0, 0 }, { 0, 2, 0, 10, 3, 0 }, { 0, 0, 0, 2, 0, 0 },
			{ 0, 2, 0, 10, 3, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 105
	private final int colorData105[][] = { { 0, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0 } };
	private final int stepData105[][] = { { 7, 0, 0, 0, 0, 7 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 10, 10, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 2, 0, 0 }, { 0, 0, 9, 9, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 7, 0, 0, 0, 0, 7 } };

	// level 8
	// level 106
	// level 106
	private final int colorData106[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData106[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 5, 0, 0, 8 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 10, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 107
	private final int colorData107[][] = { { 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData107[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 6, 8, 0, 0 }, { 0, 0, 3, 8, 0, 0 },
			{ 0, 0, 0, 11, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 21, 0, 0, 0 },
			{ 0, 0, 0, 0, 21, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 108
	private final int colorData108[][] = { { 1, 0, 0, 0, 1, 0 },
			{ 0, 1, 0, 0, 0, 1 }, { 0, 0, 0, 1, 0, 0 }, { 1, 0, 0, 0, 1, 0 },
			{ 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0, 1 },
			{ 0, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0 } };
	private final int stepData108[][] = { { 0, 0, 0, 1, 0, 0 },
			{ 0, 5, 0, 0, 0, 9 }, { 0, 0, 0, 0, 0, 0 }, { 9, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 9 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 9, 0 } };

	// level 109
	private final int colorData109[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 1, 1, 1 }, { 0, 1, 1, 1, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 }, { 0, 1, 1, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData109[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 10, 0, 0, 0, 0 }, { 5, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 12 },
			{ 0, 0, 0, 0, 0, 0 }, { 6, 0, 0, 4, 0, 0 }, { 3, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 110
	private final int colorData110[][] = { { 1, 0, 0, 1, 0, 0 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 0, 1, 1, 0, 1, 1 },
			{ 0, 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 1, 1 }, { 1, 1, 0, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData110[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 5, 0, 0, 5, 0 }, { 0, 3, 0, 0, 3, 0 }, { 0, 10, 0, 0, 10, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 6, 0, 0, 6, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 111
	private final int colorData111[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData111[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 4, 0 }, { 0, 0, 0, 0, 19, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 0, 4, 0 }, { 0, 4, 0, 0, 0, 0 }, { 0, 0, 2, 5, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 112
	private final int colorData112[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData112[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 3, 0, 8, 0 }, { 0, 0, 2, 0, 0, 0 }, { 0, 0, 7, 0, 0, 0 },
			{ 0, 0, 0, 0, 6, 0 }, { 0, 0, 3, 10, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 0, 5, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 113
	private final int colorData113[][] = { { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData113[][] = { { 0, 4, 0, 0, 0, 0 },
			{ 0, 0, 10, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 15, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 114
	private final int colorData114[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 0, 0, 1, 0 }, { 0, 1, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1, 1 },
			{ 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData114[][] = { { 0, 18, 0, 0, 0, 0 },
			{ 0, 0, 0, 14, 0, 0 }, { 0, 0, 9, 0, 0, 0 }, { 0, 0, 0, 0, 0, 18 },
			{ 0, 0, 0, 0, 0, 0 }, { 18, 0, 0, 0, 0, 0 }, { 0, 0, 0, 9, 0, 0 },
			{ 0, 0, 14, 0, 0, 0 }, { 0, 0, 0, 0, 18, 0 } };

	// level 115
	private final int colorData115[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData115[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 4, 0 }, { 0, 0, 0, 0, 3, 0 },
			{ 0, 0, 0, 3, 9, 3 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 5, 5, 0 },
			{ 0, 0, 0, 0, 2, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 116
	private final int colorData116[][] = { { 0, 0, 1, 0, 1, 1 },
			{ 0, 0, 0, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData116[][] = { { 0, 0, 7, 0, 0, 0 },
			{ 0, 0, 12, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 7, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 8, 0, 0 },
			{ 0, 0, 0, 6, 0, 0 }, { 0, 0, 0, 0, 8, 0 } };

	// level 117
	private final int colorData117[][] = { { 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 } };
	private final int stepData117[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 3, 0, 0, 0, 0, 3 }, { 0, 8, 0, 0, 8, 0 },
			{ 0, 0, 3, 3, 0, 0 }, { 0, 0, 3, 3, 0, 0 }, { 0, 0, 2, 2, 0, 0 },
			{ 0, 0, 5, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 118
	private final int colorData118[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData118[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 5, 5, 5, 5 }, { 5, 0, 0, 1, 0, 0 }, { 0, 5, 4, 0, 5, 5 },
			{ 5, 5, 0, 0, 5, 0 }, { 0, 0, 0, 3, 0, 5 }, { 5, 5, 5, 5, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 119
	private final int colorData119[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 } };
	private final int stepData119[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 0, 5, 0, 5 }, { 0, 0, 9, 0, 0, 8 }, { 0, 7, 0, 5, 0, 7 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 7, 7, 7, 3, 3 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 5, 0, 7, 0, 3 }, { 0, 0, 0, 0, 0, 0 } };

	// level 120
	private final int colorData120[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData120[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 3, 0, 3, 3, 0 }, { 0, 2, 2, 2, 2, 0 }, { 0, 3, 3, 3, 3, 0 },
			{ 4, 4, 2, 2, 4, 4 }, { 3, 0, 3, 3, 0, 3 }, { 2, 0, 2, 2, 0, 2 },
			{ 3, 0, 3, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0 } };

	// level 9
	// level 121
	private final int colorData121[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData121[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 11, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 11 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 122
	private final int colorData122[][] = { { 0, 0, 0, 1, 1, 1 },
			{ 0, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 0, 0, 0, 1, 1, 1 }, { 0, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData122[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 13, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 10, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 123
	private final int colorData123[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData123[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 5, 10, 0 }, { 0, 0, 2, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 124
	private final int colorData124[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData124[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 11, 0, 0, 0, 0 }, { 0, 0, 11, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 11, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 125
	private final int colorData125[][] = { { 0, 1, 0, 1, 0, 0 },
			{ 0, 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0, 1 },
			{ 1, 0, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0, 1 } };
	private final int stepData125[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 4 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 13, 0 }, { 0, 0, 5, 0, 0, 11 } };
	// level 126
	private final int colorData126[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData126[][] = { { 0, 0, 4, 4, 0, 0 },
			{ 0, 11, 3, 3, 11, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 2, 0, 0 }, { 0, 0, 4, 4, 0, 0 }, { 0, 0, 9, 9, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 127
	private final int colorData127[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 0 }, { 1, 0, 1, 1, 0, 1 }, { 0, 0, 1, 1, 0, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData127[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 8, 8, 0, 0 },
			{ 4, 0, 0, 0, 0, 4 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 128
	private final int colorData128[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 0, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData128[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 2, 2, 0 }, { 0, 0, 9, 0, 0, 0 },
			{ 0, 0, 4, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 129
	private final int colorData129[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 1, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData129[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 6, 0 }, { 0, 0, 0, 5, 0, 0 }, { 0, 6, 0, 6, 0, 0 },
			{ 0, 10, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 130
	private final int colorData130[][] = { { 1, 1, 0, 0, 1, 0 },
			{ 1, 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 0, 0 },
			{ 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 1 } };
	private final int stepData130[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 11 }, { 0, 0, 0, 0, 0, 0 },
			{ 7, 0, 0, 0, 0, 7 }, { 0, 0, 0, 0, 0, 0 }, { 11, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 131
	private final int colorData131[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData131[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 5 }, { 5, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 5 }, { 5, 0, 0, 1, 0, 0 }, { 1, 0, 1, 0, 1, 5 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 132
	private final int colorData132[][] = { { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData132[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 8, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 8, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 8, 0, 0, 0, 0 } };
	// level 133
	private final int colorData133[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData133[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 0, 12, 0 },
			{ 0, 0, 0, 2, 3, 0 }, { 0, 3, 2, 0, 0, 0 }, { 0, 12, 0, 3, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 134
	private final int colorData134[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData134[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 10, 4, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 0, 0, 0, 0 }, { 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 135
	private final int colorData135[][] = { { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 } };
	private final int stepData135[][] = { { 0, 0, 7, 7, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 7 },
			{ 4, 0, 0, 0, 0, 5 }, { 8, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 8, 6, 0, 0 } };

	// level 10     A-P

	// level 136
	private final int colorData136[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData136[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 2, 0, 0 }, { 0, 8, 0, 0, 8, 0 }, { 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 0, 5, 0 },
			{ 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 137
	private final int colorData137[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData137[][] = { { 0, 0, 4, 0, 0, 0 },
			{ 0, 0, 0, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 12, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 0, 0, 0 }, { 0, 0, 11, 0, 0, 0 },
			{ 0, 0, 0, 6, 0, 0 }, { 0, 0, 0, 0, 0, 4 } };
	// level 138
	private final int colorData138[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData138[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0 }, { 0, 2, 0, 0, 0, 0 },
			{ 0, 3, 0, 0, 0, 0 }, { 0, 0, 0, 0, 15, 0 }, { 0, 0, 2, 0, 1, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 139
	private final int colorData139[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0 },
			{ 1, 0, 1, 1, 1, 0 }, { 1, 0, 1, 1, 1, 0 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData139[][] = { { 0, 0, 18, 0, 0, 0 },
			{ 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0, 2 }, { 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0, 1 },
			{ 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 140
	private final int colorData140[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData140[][] = { { 0, 0, 0, 9, 0, 0 },
			{ 0, 0, 0, 14, 5, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 7, 0, 0 },
			{ 0, 0, 0, 4, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 16 },
			{ 0, 0, 0, 0, 0, 6 }, { 0, 0, 0, 0, 0, 0 } };
	// level 141
	private final int colorData141[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData141[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 6, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 6 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 0, 0, 0, 0 }, { 0, 0, 8, 0, 0, 0 } };
	// level 142
	private final int colorData142[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData142[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 },
			{ 0, 0, 2, 0, 16, 0 }, { 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 143
	private final int colorData143[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData143[][] = { { 0, 7, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 2, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 11, 0, 0 }, { 0, 12, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 7, 0 } };
	// level 144
	private final int colorData144[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData144[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 8, 0 }, { 0, 0, 11, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0 },
			{ 0, 9, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 145
	private final int colorData145[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData145[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 28, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 22, 0 }, { 0, 5, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 146
	private final int colorData146[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData146[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 7, 0 }, { 0, 0, 0, 0, 4, 0 }, { 0, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 12 }, { 0, 0, 1, 0, 2, 0 }, { 0, 0, 0, 3, 0, 0 },
			{ 0, 0, 0, 0, 9, 0 }, { 0, 7, 0, 4, 0, 0 } };
	// level 147
	private final int colorData147[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData147[][] = { { 0, 0, 6, 6, 15, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 0, 0, 3 }, { 0, 3, 0, 0, 0, 3 },
			{ 0, 3, 0, 0, 0, 3 }, { 0, 3, 0, 0, 0, 3 }, { 0, 3, 0, 0, 0, 3 },
			{ 0, 3, 6, 6, 6, 0 }, { 0, 0, 3, 0, 0, 0 } };
	// level 148
	private final int colorData148[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData148[][] = { { 1, 3, 1, 1, 0, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 1, 15, 1 }, { 0, 0, 4, 4, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 6, 0, 0, 0, 0 },
			{ 4, 0, 3, 3, 0, 0 }, { 0, 0, 5, 5, 0, 0 } };

	// level 149
	private final int colorData149[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 1, 0 }, { 0, 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 1, 0 },
			{ 0, 1, 1, 0, 1, 0 }, { 0, 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData149[][] = { { 0, 0, 0, 0, 0, 21 },
			{ 0, 0, 6, 0, 5, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 7, 0, 0, 0, 1, 5 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 150
	private final int colorData150[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 0, 0, 1, 1, 0, 0 }, { 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 0, 0 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData150[][] = { { 0, 0, 0, 1, 0, 0 },
			{ 24, 0, 6, 0, 0, 0 }, { 0, 1, 0, 0, 3, 0 }, { 0, 0, 4, 3, 0, 3 },
			{ 3, 0, 3, 4, 0, 0 }, { 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 3, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

	// level 11
	// level 151
	private final int colorData151[][] = { { 1, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 0 } };
	private final int stepData151[][] = { { 0, 0, 0, 5, 0, 0 },
			{ 0, 0, 0, 0, 0, 12 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 11, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 1 }, { 0, 7, 0, 0, 0, 0 } };
	// level 152
	private final int colorData152[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData152[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 14, 0 }, { 0, 0, 0, 3, 3, 0 }, { 0, 0, 0, 0, 3, 10 },
			{ 0, 0, 0, 3, 0, 0 }, { 0, 8, 3, 3, 3, 0 }, { 0, 0, 0, 0, 3, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 153
	private final int colorData153[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData153[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 2, 9, 0 },
			{ 0, 0, 2, 0, 2, 0 }, { 0, 0, 2, 0, 2, 0 }, { 0, 0, 2, 0, 2, 0 },
			{ 0, 0, 21, 2, 2, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 154
	private final int colorData154[][] = { { 1, 0, 0, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 } };
	private final int stepData154[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 20, 0, 0, 0 }, { 0, 12, 6, 12, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 7, 0, 0, 0 }, { 0, 0, 3, 0, 0, 0 },
			{ 0, 0, 3, 0, 0, 0 }, { 0, 0, 6, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 155
	private final int colorData155[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData155[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 0, 6, 0 },
			{ 0, 0, 0, 0, 5, 0 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 2, 0, 0, 0 },
			{ 0, 0, 0, 0, 10, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 156
	private final int colorData156[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData156[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 4, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 12, 0, 0, 0 }, { 0, 0, 0, 0, 2, 0 }, { 0, 6, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 157
	private final int colorData157[][] = { { 0, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData157[][] = { { 7, 0, 0, 0, 0, 0 },
			{ 0, 7, 0, 0, 0, 0 }, { 0, 0, 8, 0, 0, 0 }, { 0, 0, 0, 6, 0, 0 },
			{ 0, 0, 0, 0, 9, 0 }, { 0, 0, 0, 0, 0, 12 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 158
	private final int colorData158[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0, 0 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1 }, { 0, 0, 1, 0, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData158[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 2, 0 }, { 0, 4, 2, 6, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 6, 2, 4, 0 },
			{ 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 159
	private final int colorData159[][] = { { 0, 0, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0 } };
	private final int stepData159[][] = { { 0, 0, 1, 14, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 8, 0, 0, 0, 0, 25 }, { 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 6, 1, 0, 0 } };
	// level 160
	private final int colorData160[][] = { { 0, 0, 1, 1, 0, 0 },
			{ 1, 0, 1, 1, 0, 1 }, { 0, 0, 1, 1, 0, 0 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 0, 0, 1, 1, 0, 0 },
			{ 1, 0, 1, 1, 0, 1 }, { 0, 0, 1, 1, 0, 0 } };
	private final int stepData160[][] = { { 4, 0, 10, 10, 0, 4 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 2, 4, 4, 2, 0 }, { 0, 0, 2, 2, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 2, 0, 0 }, { 0, 2, 4, 4, 2, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 4, 0, 10, 10, 0, 4 } };
	// level 161
	private final int colorData161[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData161[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 5, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 6 }, { 6, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 5, 10, 0, 0 } };
	// level 162
	private final int colorData162[][] = { { 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData162[][] = { { 0, 8, 0, 0, 0, 0 },
			{ 0, 0, 10, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 7, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 22, 6, 0 },
			{ 0, 9, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 163
	private final int colorData163[][] = { { 0, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 1 } };
	private final int stepData163[][] = { { 10, 0, 0, 0, 0, 11 },
			{ 0, 0, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 11 },
			{ 0, 0, 0, 0, 0, 0 }, { 6, 0, 0, 0, 0, 0 } };
	// level 164
	private final int colorData164[][] = { { 1, 1, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 } };
	private final int stepData164[][] = { { 0, 0, 0, 0, 3, 0 },
			{ 0, 0, 0, 0, 2, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 2, 7, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 7, 2, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 2, 0, 0, 0, 0 }, { 0, 3, 0, 0, 0, 0 } };
	// level 165
	private final int colorData165[][] = { { 1, 0, 0, 0, 1, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1 } };
	private final int stepData165[][] = { { 0, 0, 0, 0, 8, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 4, 0, 0, 0, 0, 11 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 11, 0, 0, 0, 0, 4 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 8, 0, 0, 0, 0 } };
	// level 12
	// level 166  ,
	private final int colorData166[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData166[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 6, 0, 0, 0 }, { 0, 3, 9, 0, 0, 0 },
			{ 0, 6, 3, 0, 0, 0 }, { 0, 7, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 167,
	private final int colorData167[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData167[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 5, 0, 0 }, { 0, 2, 7, 4, 0, 0 },
			{ 0, 4, 7, 2, 0, 0 }, { 0, 5, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 168,
	private final int colorData168[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 0 }, { 0, 1, 1, 1, 1, 0 },
			{ 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData168[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 0, 5, 0 }, { 0, 5, 0, 0, 5, 0 },
			{ 3, 0, 0, 0, 0, 3 }, { 0, 4, 9, 9, 4, 0 }, { 0, 0, 2, 2, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 169,
	private final int colorData169[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData169[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 7, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 7, 2, 0, 0 },
			{ 0, 0, 9, 4, 0, 0 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 0, 4, 0, 0 },
			{ 0, 0, 0, 22, 6, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 170
	private final int colorData170[][] = { { 0, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 0, 0 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData170[][] = { { 4, 0, 0, 0, 0, 21 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 5, 3, 0, 5, 0 }, { 0, 4, 0, 0, 0, 0 },
			{ 0, 2, 0, 3, 5, 0 }, { 0, 4, 4, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 11, 0 } };
	// level 171
	private final int colorData171[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 0, 0, 1 }, { 1, 1, 1, 0, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1 } };
	private final int stepData171[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 4, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 3, 11, 0, 0, 4, 0 },
			{ 0, 0, 11, 2, 0, 0 }, { 0, 0, 11, 2, 0, 0 },
			{ 3, 11, 0, 0, 4, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 4, 0, 0, 0 } };
	// level 172
	private final int colorData172[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 1, 0 }, { 1, 0, 1, 0, 1, 0 },
			{ 1, 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData172[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 9, 0, 0 }, { 0, 4, 0, 0, 0, 0 }, { 11, 0, 0, 3, 0, 0 },
			{ 0, 0, 0, 0, 11, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 9, 0, 0, 0 },
			{ 0, 0, 0, 5, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 173
	private final int colorData173[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1 }, { 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 1, 0, 1 }, { 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData173[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 6, 2, 0 }, { 0, 0, 0, 8, 0, 0 },
			{ 0, 2, 4, 5, 4, 0 }, { 0, 0, 0, 15, 15, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 174
	private final int colorData174[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData174[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 11, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 22, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 17, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 175
	private final int colorData175[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 0, 1, 0 }, { 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0 }, { 1, 1, 1, 0, 1, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData175[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 7, 0, 0 }, { 0, 0, 0, 17, 4, 8 },
			{ 0, 0, 0, 3, 9, 5 }, { 0, 0, 0, 8, 0, 0 }, { 0, 0, 3, 0, 0, 0 },
			{ 0, 0, 0, 8, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 176
	private final int colorData176[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1 },
			{ 1, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData176[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 2, 0 }, { 0, 0, 0, 4, 3, 0 }, { 0, 3, 3, 0, 0, 0 },
			{ 0, 3, 0, 7, 0, 0 }, { 0, 0, 0, 4, 0, 0 }, { 0, 0, 0, 0, 3, 0 },
			{ 0, 3, 3, 0, 0, 0 }, { 0, 2, 0, 0, 0, 8 } };
	// level 177
	private final int colorData177[][] = { { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1 }, { 1, 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData177[][] = { { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 4, 5, 0 }, { 0, 0, 0, 0, 1, 0 }, { 0, 2, 5, 0, 0, 0 },
			{ 0, 4, 0, 0, 0, 0 }, { 0, 5, 0, 3, 0, 0 }, { 0, 0, 9, 7, 6, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
	// level 178
	private final int colorData178[][] = { { 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData178[][] = { { 0, 0, 7, 0, 0, 0 },
			{ 0, 0, 5, 0, 0, 0 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0 },
			{ 4, 2, 0, 1, 3, 5 }, { 0, 0, 2, 0, 0, 0 }, { 0, 0, 4, 0, 0, 0 },
			{ 0, 0, 6, 0, 0, 0 }, { 0, 0, 8, 0, 0, 0 } };
	// level 179
	private final int colorData179[][] = { { 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1 },
			{ 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
	private final int stepData179[][] = { { 0, 0, 7, 1, 0, 5 },
			{ 0, 0, 5, 1, 0, 4 }, { 0, 0, 3, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0 },
			{ 3, 3, 1, 3, 2, 4 }, { 1, 1, 2, 2, 0, 0 }, { 0, 0, 4, 0, 0, 0 },
			{ 2, 2, 6, 1, 0, 0 }, { 9, 7, 8, 3, 0, 0 } };
	// level 180
	private final int colorData180[][] = { { 0, 1, 1, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 0 }, { 0, 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0 },
			{ 1, 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1, 0 },
			{ 0, 0, 1, 1, 1, 0 }, { 1, 0, 0, 1, 1, 1 } };
	private final int stepData180[][] = { { 7, 3, 1, 0, 2, 7 },
			{ 5, 9, 2, 6, 1, 3 }, { 3, 7, 2, 0, 1, 3 }, { 1, 0, 3, 3, 1, 3 },
			{ 0, 6, 1, 1, 7, 0 }, { 3, 1, 3, 3, 0, 2 }, { 3, 1, 0, 2, 8, 4 },
			{ 3, 1, 6, 2, 10, 6 }, { 8, 3, 1, 0, 2, 4 } };

}
