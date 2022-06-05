package com.company;

class Team {
    public static void main(String[] args) {
        Member[] members = new Member[]{
                new Member("Vera", 0, 0, 0, 7, 5, 14),
                new Member("Lina", 0, 0, 0, 8, 6, 16),
                new Member("Anna", 0, 0, 0, 9, 7, 18),
                new Member("Julia", 0, 0, 0,10, 8,20)
        };
        Group group = new Group(" Super Lady", members);
        System.out.println(group);
        Course course = new Course(100, 5000, 200);
        course.doIt(members);
        for (Member member:members ) {
            System.out.println(member.toString());
        }
    }
}
class Member {
    private String name;
    private int raceResult;
    private int swimResult;
    private int bikeResult;
    private int speedRun;
    private int speedSwim;
    private int speedBike;

    public Member(String name, int raceResult, int swimResult, int bikeResult, int speedRun,
                  int speedSwim, int speedBike) {
        this.name = name;
        this.raceResult = raceResult;
        this.swimResult = swimResult;
        this.bikeResult = bikeResult;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.speedBike = speedBike;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public int getSpeedBike() {
        return speedBike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRaceResult() {
        return raceResult;
    }

    public void setRaceResult(int raceResult) {
        this.raceResult = raceResult;
    }

    public int getSwimResult() {
        return swimResult;
    }

    public void setSwimResult(int swimResult) {
        this.swimResult = swimResult;
    }

    public int getBikeResult() {
        return bikeResult;
    }

    public void setBikeResult(int bikeResult) {
        this.bikeResult = bikeResult;
    }

    @Override
    public String toString() {
        return "Member{" +
                name +
                ", raceResult:" + raceResult + "sec" +
                ", swimResult:" + swimResult + "sec" +
                ", bikeResult:" + bikeResult + "sec" +
                '}';
    }
}
class Group {
    private String name;
    private Member[] members;

    public Group (String name, Member[] members) {
        this.name = name;
        this.members = members;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group:" +  name;
    }

    public Member[] getMembers() {
        return members;
    }
}

class Course {
    String result;

    private int runDistance100;
    private int bikeDistance5000;
    private int swim200;


    Course (int runDistance100, int bikeDistance5000, int swim200) {
        this.runDistance100 = runDistance100;
        this.bikeDistance5000 = bikeDistance5000;
        this.swim200 = swim200;
    }
    public void doIt (Member[] members) {
        for (Member member: members) {
            member.setRaceResult(runDistance100/member.getSpeedRun());
            member.setBikeResult(bikeDistance5000/member.getSpeedBike());
            member.setSwimResult(swim200/member.getSpeedSwim());
        }

    }

}
