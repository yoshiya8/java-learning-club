package git.javalearningclub.listsorter.impl;

import java.util.List;

import git.javalearningclub.listsorter.ListSorter;

public class JoelsListSorter implements ListSorter{

	@Override
	public void sortArray(List<String> listToSort) {
		listToSort.sort((s1, s2) -> s1.compareTo(s2));
		
	}

	
	
}
