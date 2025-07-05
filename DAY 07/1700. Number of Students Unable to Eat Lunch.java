class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwiche = new LinkedList<>();
        for(int i:students){
            student.add(i);
        }
        for(int i:sandwiches){
            sandwiche.add(i);
        }
        int i=0;
        int count = 0;
        while(i<sandwiches.length){
            if(student.peek() == (sandwiche.peek())){
                student.poll();
                sandwiche.poll();
                count=0;
            }else{
                int val = student.poll();
                student.add(val);
                count++;
            }
            if(count==student.size()){
                break;
            }
        }
        return student.size();
    }
}
