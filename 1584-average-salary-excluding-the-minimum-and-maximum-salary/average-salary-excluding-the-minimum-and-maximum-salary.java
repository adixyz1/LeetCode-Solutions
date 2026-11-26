class Solution {
    public double average(int[] salary) {
        int salAvg = 0;
        int n = salary.length-2;
        double maxSalary = Double.MIN_VALUE;
        double minSalary = Double.MAX_VALUE;

        for(int i=0; i<salary.length; i++){
            maxSalary = Math.max(maxSalary,salary[i]);
            minSalary = Math.min(minSalary,salary[i]);
        }
        for(int i=0; i<salary.length; i++){
            salAvg += salary[i];
        }
        return (salAvg-(minSalary+maxSalary))/n;
    }
}