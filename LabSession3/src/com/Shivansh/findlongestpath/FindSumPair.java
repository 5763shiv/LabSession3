package com.Shivansh.findlongestpath;

import java.util.HashSet;

import com.Shivansh.treesum.Node;

public class FindSumPair {
	public Node insert(Node root,int key)
	{
		if (root==null)
			return new Node(key);
		if (key<root.nodeData)
			root.leftNode =insert(root.leftNode,key);
		else
			root.rightNode = insert(root.rightNode,key);
		return root;
		
	}

	public boolean findpairutil(Node root, int sum,HashSet<Integer> set)
	{
		if(root == null)
				return false;
		if(findpairutil(root.leftNode,sum,set))
			return true;
		if(set.contains(sum-root.nodeData))
		{
			System.out.println("Pair is found ("
					+(sum-root.nodeData)+ ", "
					+ root.nodeData  + ")");
		}
		else
			set.add(root.nodeData);
		
		return findpairutil(root.rightNode,sum,set);
		
	}
	
	
	public void findPairWithGivenSum(Node root, int sum ) {
		HashSet<Integer> set= new HashSet<Integer>();
		if(!findpairutil(root,sum,set))
			System.out.println("Pairs do not exists"+"\n");
	}
	
}
