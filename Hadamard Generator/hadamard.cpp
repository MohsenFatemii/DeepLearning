#include <bits/stdc++.h>

using namespace std;

vector<vector<int>> h(int n){
	if (n==0)
		return {{1}};
	auto temp = h(n-1);
	vector<vector<int>> v;
	for (int i = 0; i < pow(2,n); i++){
		vector<int> t= {};
		v.push_back(t);
	}
	for (int x = 0; x < 4; x++){
		int it = (x>=2)?(pow(2,n)/2):(0);
		for (auto i:temp){
			for (auto j:i)
				if(x<3)
					v[it].push_back(j);
				else
					v[it].push_back(-j);
			it++;
		}
	}
	return v;
}

int main(){
	int n;
	cin >> n;
	for (auto u:h(--n)){
		for (auto k:u)
			cout << k << ' ';
		cout << endl;
	}
	return 0;
}