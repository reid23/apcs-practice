class StepTracker {
    int minSteps;
    int total = 0;
    int totalDays = 0;
    int activeDays = 0;
    public StepTracker(int minSteps){
        this.minSteps = minSteps;
    }
    public void addDailySteps(int steps){
        this.total+=steps;
        this.totalDays++;
        if(steps>=this.minSteps){
            this.activeDays++;
        }
    }
    public int activeDays(){
        return this.activeDays;
    }
    public int averageSteps(){
        if(this.totalDays == 0){
            return 0;
        }
        return this.total/this.totalDays;
    }
}