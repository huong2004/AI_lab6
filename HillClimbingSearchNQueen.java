package student1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lab_7.Node;

public class HillClimbingSearchNQueen {
	public Node execute(Node initialState) {
		// Enter your code here.
		Node current = initialState;

		while (true) {
			Node neighbor = current.getBestCandidate();
			if (neighbor.getH() < current.getH())
				current = neighbor;
			else
				return current;
		}
	}

	public Node executeHillClimbingWithRandomRestart(Node initialState) {
		// Enter your code here.
		Node current = initialState;
		int maxRestart = 10; // So lan khoi tao toi da
		for (int i = 0; i < maxRestart; i++) {
			while (true) {
				Node neighbor = current.getBestCandidate();
				if (neighbor.getH() < current.getH()) {
					current = neighbor;
				} else {
					break; // dat trang thai cuc bo toi thieu (local minimum)
				}
			}

			// Check if the current state is a goal state
			if (current.getH() == 0) {
				return current; // Found a solution
			}

		}return null;
	}
}
