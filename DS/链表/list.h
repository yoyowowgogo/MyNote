#pragma once
#include<iostream>
#include<vector>
using namespace std;
struct Node
{
	int val;
	Node* next;
	Node();
	Node(int val);

};
class List
{
	Node* head;
	int len;
public:
	List(vector<int> list);
	~List();
	Node* getNode(int index);
	bool insert(int index,int val);
	bool del(int index);
	int search(int index);
	void print();

};