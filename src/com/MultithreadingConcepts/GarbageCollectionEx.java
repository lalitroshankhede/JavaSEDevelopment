package com.MultithreadingConcepts;

public class GarbageCollectionEx {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		GarbageCollectionEx s1 = new GarbageCollectionEx();
		GarbageCollectionEx s2 = new GarbageCollectionEx();
		s1 = null;
		s2 = null;
		System.gc();
	}
}
