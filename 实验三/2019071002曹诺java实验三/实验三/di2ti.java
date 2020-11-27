package 实验三;

class Company {
    Employee[] em; //Employee作为成员
    Company(Employee[] em) { //构造函数
        this.em=em;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee[] em=new Employee[3];
        em[0]=new YearWorker(1,12000.0); //上转型对象
        em[1]=new MonthWorker(11,8000.0);
        em[2]=new WeekWorker(40,1200.0);
        Company com=new Company(em);
        double sum;
        sum=em[0].earnings()+em[1].earnings()+em[2].earnings();
        System.out.println("总工资为:"+sum);

    }

}
abstract class Employee {
    abstract double earnings(); //抽象方法
}
class MonthWorker extends Employee {
    int month;
    double monthSalary;
    MonthWorker(int m,double s){
        month=m;
        monthSalary=s;
    }
    double earnings() {
        return month*monthSalary;
    }

}
class WeekWorker extends Employee {
    int week;
    double weekSalary;
    WeekWorker(int w,double s){
        week=w;
        weekSalary=s;
    }
    double earnings() {
        return week*weekSalary;
    }
}
class YearWorker extends Employee {
    int year;
    double yearSalary;
    YearWorker(int y,double s){ //工作年数，年工资
        year=y;
        yearSalary=s;
    }
    double earnings() {  //重写抽象方法
        return year*yearSalary;
    }

}