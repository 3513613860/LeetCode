/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap<>();
        for(Employee cur:employees){
            map.put(cur.id,cur);
        }
        return dfs(map,id);
    }

    public int dfs(Map<Integer,Employee> map,int id){
        int curImportance = map.get(id).importance;
        for(int subid:map.get(id).subordinates){
            curImportance += dfs(map,subid);
        }
        return curImportance;
    }
}