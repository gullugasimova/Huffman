package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

import code.Code;
import code.Huffman;
import code.Code.CodeItem;

public class TCode {

	public static void main(String[] args) {
		Code.CodeItem[] ci = {
				new Code.CodeItem("A", 0.12),
				new Code.CodeItem("B", 0.19),
				new Code.CodeItem("C", 0.40),
				new Code.CodeItem("D", 0.13),
				new Code.CodeItem("E", 0.16)				
		};
		Code c = new Code(ci);
		
		Terminal.put("------------------ Producing Huffman code ...");
		Huffman.generateHuffmanCode(c);
		Terminal.put("Code: \n" + c);
		if (!c.isPrefixCode())
			Terminal.put("... is not a prefix code ...");
		else 
			if (!c.is01())
				Terminal.put("... is not 01 ...");
				else {
					Terminal.put("Entropy:             "  + c.entropy());
					Terminal.put("Average Word Length: "  + c.averageWordLength());
				}

		Code.CodeItem[] ci1 = {
				new Code.CodeItem("A", 0.30),
				new Code.CodeItem("B", 0.24),
				new Code.CodeItem("C", 0.04),
				new Code.CodeItem("D", 0.10),
				new Code.CodeItem("E", 0.12),	
				new Code.CodeItem("F", 0.20),

		};
		Code c1 = new Code(ci1);
		Terminal.put("------------------ Producing Huffman code ...");
		Huffman.generateHuffmanCode(c1);
		Terminal.put("Code: \n" + c1);
		if (!c1.isPrefixCode())
			Terminal.put("... is not a prefix code ...");
		else 
			if (!c1.is01())
				Terminal.put("... is not 01 ...");
				else {
					Terminal.put("Entropy:             "  + c1.entropy());
					Terminal.put("Average Word Length: "  + c1.averageWordLength());
				}
		Code.CodeItem[] ci2 = {
				new Code.CodeItem("A", 0.09),
				new Code.CodeItem("B", 0.16),
				new Code.CodeItem("C", 0.1),
				new Code.CodeItem("D", 0.005),
				new Code.CodeItem("E", 0.13),		
				new Code.CodeItem("F", 0.15),
				new Code.CodeItem("G", 0.15),
				new Code.CodeItem("H", 0.095),
				new Code.CodeItem("I", 0.12),

		};
		Code c2 = new Code(ci2);
		Huffman.generateHuffmanCode(c2);
		Terminal.put("Code: \n" + c2);
		if (!c2.isPrefixCode())
			Terminal.put("... is not a prefix code ...");
		else 
			if (!c2.is01())
				Terminal.put("... is not 01 ...");
				else {
					Terminal.put("Entropy:             "  + c2.entropy());
					Terminal.put("Average Word Length: "  + c2.averageWordLength());
				}
		Code.CodeItem[] ci3 = {
				new Code.CodeItem("A", 0.06),
				new Code.CodeItem("B", 0.01),
				new Code.CodeItem("C", 0.05),
				new Code.CodeItem("D", 0.01),
				new Code.CodeItem("S", 0.08),
				new Code.CodeItem("T", 0.04),
				new Code.CodeItem("E", 0.03),
				new Code.CodeItem("F", 0.06),
				new Code.CodeItem("G", 0.02),
				new Code.CodeItem("H", 0.01),
				new Code.CodeItem("I", 0.05),
				new Code.CodeItem("J", 0.07),
				new Code.CodeItem("K", 0.025),
				new Code.CodeItem("L", 0.08),
				new Code.CodeItem("M", 0.05),
				new Code.CodeItem("N", 0.02),
				new Code.CodeItem("O", 0.07),
				new Code.CodeItem("P", 0.04),
				new Code.CodeItem("Q", 0.09),
				new Code.CodeItem("R", 0.01),
				new Code.CodeItem("W", 0.01),
				new Code.CodeItem("X", 0.07),
				new Code.CodeItem("Y", 0.009),
				new Code.CodeItem("Z", 0.001),
				new Code.CodeItem("a", 0.03),
				new Code.CodeItem("b", 0.001),
				new Code.CodeItem("c", 0.004),

		};
		Code c3 = new Code(ci3);
		Huffman.generateHuffmanCode(c3);
		Terminal.put("Code: \n" + c3);
		if (!c3.isPrefixCode())
			Terminal.put("... is not a prefix code ...");
		else 
			if (!c3.is01())
				Terminal.put("... is not 01 ...");
				else {
					Terminal.put("Entropy:             "  + c3.entropy());
					Terminal.put("Average Word Length: "  + c3.averageWordLength());
				}
		Code.CodeItem[] ci4 = {
				new Code.CodeItem("A", 0.06),
				new Code.CodeItem("U", 0.06),
				new Code.CodeItem("B", 0.01),
				new Code.CodeItem("C", 0.05),
				new Code.CodeItem("D", 0.13),
				new Code.CodeItem("E", 0.03),
				new Code.CodeItem("F", 0.06),
				new Code.CodeItem("G", 0.02),
				new Code.CodeItem("H", 0.2),
				new Code.CodeItem("I", 0.05),
				new Code.CodeItem("J", 0.07),
				new Code.CodeItem("K", 0.06),
				new Code.CodeItem("L", 0.08),
				new Code.CodeItem("M", 0.05),
				new Code.CodeItem("N", 0.02),
				new Code.CodeItem("O", 0.025),
				new Code.CodeItem("P", 0.025),

		};
		Code c4 = new Code(ci4);
		Huffman.generateHuffmanCode(c4);
		Terminal.put("Code: \n" + c4);
		if (!c4.isPrefixCode())
			Terminal.put("... is not a prefix code ...");
		else 
			if (!c4.is01())
				Terminal.put("... is not 01 ...");
				else {
					Terminal.put("Entropy:             "  + c4.entropy());
					Terminal.put("Average Word Length: "  + c4.averageWordLength());
				}
	}
	
}

