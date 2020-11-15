package heaps;

import java.util.PriorityQueue;

public class PriorityQueueUsingObjects {

    public static void main(String[] args) {
        PriorityQueueUsingObjects caller = new PriorityQueueUsingObjects();
        caller.buildSolution();


    }

    public void buildSolution() {
        House red = new House(1, "RED");
        House blue = new House(2, "BLUE");
        House green = new House(3, "GREEN");

        //based upon string alphabets
        PriorityQueue<House> minHouse = new PriorityQueue<>((h1, h2) -> {
            return h1.getHouseName().compareTo(h2.getHouseName());
        });

        //based upon string alphabets
        PriorityQueue<House> maxHouse = new PriorityQueue<>((h1, h2) -> {
            return h2.getHouseName().compareTo(h1.getHouseName());
        });


        minHouse.offer(red);
        minHouse.offer(blue);
        minHouse.offer(green);

        while (!minHouse.isEmpty()) {
            System.out.println(minHouse.poll().getHouseName());

        }


        maxHouse.offer(red);
        maxHouse.offer(blue);
        maxHouse.offer(green);
        System.out.println("");
        while (!maxHouse.isEmpty()) {

            System.out.println(maxHouse.poll().getHouseName());

        }
    }


    class House {

        int houseNo;
        String houseName;

        public House(int houseNo, String houseName) {
            this.houseNo = houseNo;
            this.houseName = houseName;
        }

        public int getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(int houseNo) {
            this.houseNo = houseNo;
        }

        public String getHouseName() {
            return houseName;
        }

        public void setHouseName(String houseName) {
            this.houseName = houseName;
        }
    }
}
