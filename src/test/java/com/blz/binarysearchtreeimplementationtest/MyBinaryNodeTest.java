package com.blz.binarysearchtreeimplementationtest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyBinaryNodeTest {

	@Test
	public void given3NumbersWhenAddedToBinarySearchTreeShouldReturnsSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);
	}

}
