package com.lab1;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Workers {
        private ArrayList<Worker> workers = new ArrayList<Worker>();

        public ArrayList<Worker> getWorks() {return this.workers;}

        public void addWork(Worker worker) {
            if (worker instanceof Worker) {
                this.workers.add(worker);
            } else {
                System.err.print("Error 404!");
            }
        }
    @Override
    public String toString() {
        Worker worker = new Worker();
        LocalDate now = LocalDate.now();
      //  System.out.println(Period.between(worker.getDateOfBirth(), now).getYears())
        int minAge=Integer.MAX_VALUE;
        int age;
        //String[] year = work.getDateOfBirth().split("/");
        for (int i = 0; i< workers.size(); i++)
        {
            Worker temp = workers.get(i);
            String[] year = temp.getDateOfBirth().split("/");
            int[] intYear=new int[year.length];
            int j=0;
            for(String changer:year){
                intYear[j]=Integer.parseInt(changer);//Exception in this line
                j++;

            }
            age = 2021-intYear[2];
            if (minAge>age)minAge=age;
        }
            String ageFin= String.valueOf(minAge);
            //System.out.println("\n[RESULT (YOUNGER)]\n"+age);
            StringBuilder answer = new StringBuilder();
            answer.append("\n[RESULT: THE YOUNGER WORKER]\n");
            answer.append(ageFin);

        return answer.toString();
    }
}
