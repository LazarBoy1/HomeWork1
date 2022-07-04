package HomeWork3.Task3;

import java.util.ArrayList;

public class Deposit <T extends Money>{

    T[] moneyArray;

    ArrayList<T> moneyList;

    public Deposit(T[] moneyArray, ArrayList<T> moneyList) {
        this.moneyArray = moneyArray;
        this.moneyList = moneyList;
    }

    public Integer getRubArray(){
        Integer result = 0;
        for(T t: getMoneyArray()){
            if(t!=null) {
                Integer value = t.getConvertToRub();
                result = result + value;
            }
        }
        return result;
    }

    public Integer getRubList(){
        Integer result = 0;
        for(T t: getMoneyList()){
            if(t!=null) {
                Integer value = t.getConvertToRub();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Deposit<? extends Money> deposit){
        if(this.getRubArray().intValue() == deposit.getRubArray().intValue()) return true;
        return false;
    }

    public Boolean compareList(Deposit<T> deposit){
        if(this.getRubList().intValue() == deposit.getRubList().intValue()) return true;
        return false;
    }

    public void toEmptyArray(Deposit<T> deposit){
        System.out.println("������� �������� ��: " + this.getRubArray());
        System.out.println("� ������� �������� ��: " + deposit.getRubArray());
        for(int i = 0; i<deposit.getMoneyArray().length;i++){
            if(deposit.getMoneyArray()[i]!=null) {
                this.getMoneyArray()[getSize()] = deposit.getMoneyArray()[i];
                deposit.getMoneyArray()[i] = null;
            }
        }
        System.out.println("������� �������� �����: " + this.getRubArray());
        System.out.println("� ������� �������� �����: " + deposit.getRubArray());
    }
    private int getSize(){
        int result = 0;
        for(T t: getMoneyArray()){
            if(t!=null)result++;
        }
        return result;
    }

    public void toEmptyList(Deposit<T> deposit){
        System.out.println("������� �������� ��: " + this.getRubList());
        System.out.println("� ������� �������� ��: " + deposit.getRubList());
        for(T t: deposit.getMoneyList()){
            this.getMoneyList().add(t);
        }
        deposit.getMoneyList().clear();
        System.out.println("������� �������� �����: " + this.getRubList());
        System.out.println("� ������� �������� �����: " + deposit.getRubList());
    }



    public T[] getMoneyArray() {
        return moneyArray;
    }

    public ArrayList<T> getMoneyList() {
        return moneyList;
    }
}