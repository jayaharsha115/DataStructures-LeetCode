class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = (hour%12)*30+(minutes*0.5);
        double minuteAngle = minutes * 6;
        
        double angle = Math.abs(hourAngle-minuteAngle);
        
        return Math.min(angle , 360-angle);
        
    }
}