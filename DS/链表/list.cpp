#include"list.h"

Node::Node() { next = NULL; }
Node::Node(int val) { this->val = val; next = NULL; }

List::List(vector<int> list)
{
	head = new Node;
	Node* p = head;
	for (int i = 0; i < list.size(); i++)
	{
		Node* node = new Node(list[i]);
		p->next = node;
		p = node;
	}
	len = list.size();
}
List::~List()
{
	Node* q;
	while (head)
	{
		q = head;
		head = head->next;
		delete q;
	}
	head = NULL;
	len = 0;
}

Node* List::getNode(int index)
{
	if (index<1 || index>len)
		return NULL;
	Node *p=head;
	for (int i = 0; i < index; i++)
		p = p->next;
	return p;
}
bool List::insert(int index,int val)
{
	if (index<1 || index >len)
		return 0;
	Node* res;
	if (index == 1)
		res = head;
	else
		res = getNode(index-1);
	if (res == NULL)
		return 0;
	Node* q = res->next;
	Node *node = new Node(val);
	res->next = node;
	node->next = q;
	len++;
	return 1;
}

bool List::del(int index)
{
	if (index<1 || index>len)
		return 0;
	Node* res;
	if (index == 1)
		res = head;
	else
		res = getNode(index - 1);
	Node* q = res->next->next;
	Node* node = res->next;
	delete node;
	res->next = q;
	len--;
	return 1;
}

int List::search(int index)
{
	if (index<1 || index>len)
		return -1;
	Node* res = getNode(index);
	if (res == NULL)
		return -1;
	else
		return res->val;
}
void List::print()
{
	Node* p = head->next;
	while (p)
	{
		cout << p->val << " "  ;
		p = p->next;
	}
	cout << endl;
}

int main()
{
	int n;
	cin >> n;
	vector<int> vec_list(n);
	for (int i = 0; i < n; i++)
		cin >> vec_list[i];
	List list(vec_list);
	list.print();
}