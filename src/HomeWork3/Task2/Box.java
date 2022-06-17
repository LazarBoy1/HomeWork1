package HomeWork3.Task2;

import java.util.ArrayList;

    public class Box <T extends Fruit>{

        T[] fruitArray;

        ArrayList<T> fruitList;

        public Box (T[] fruitArray, ArrayList<T> fruitList) {
            this.fruitArray = fruitArray;
            this.fruitList = fruitList;
        }

        public Float getWeightArray(){
            Float result = 0.0f;
            for(T t: getFruitArray()){
                if(t!= null) {
                    Integer value = t.getConvertToKg();
                    result = result + value;
                }
            }
            return result;
        }

        public Float getWeightList(){
            Float result = 0.0f;
            for(T t: getFruitList()){
                if(t!=null) {
                    Integer value = t.getConvertToKg();
                    result = result + value;
                }
            }
            return result;
        }

        public Boolean compare(Box<? extends Fruit> box){
            if(this.getWeightArray().intValue() == box.getWeightArray().intValue()) return true;
            return false;
        }

        public Boolean compareList(Box<T> box){
            if(this.getWeightList().intValue() == box.getWeightList().intValue()) return true;
            return false;
        }

        public void toEmptyArray(Box<T> box){
            System.out.println("Первая коробка до: " + this.getWeightArray());
            System.out.println("Вторая корбка до: " + box.getWeightArray());
            for(int i = 0; i<box.getFruitArray().length;i++){
                if(box.getFruitArray()[i]!=null) {
                    this.getFruitArray()[getSize()] = box.getFruitArray()[i];
                    box.getFruitArray()[i] = null;
                }
            }
            System.out.println("Первая коробка после: " + this.getWeightArray());
            System.out.println("Вторая корбка после: " + box.getWeightArray());
        }
        private int getSize(){
            int result = 0;
            for(T t: getFruitArray()){
                if(t!=null)result++;
            }
            return result;
        }

        public void toEmptyList(Box<T> box){
            System.out.println("Первая коробка до: " + this.getWeightList());
            System.out.println("Вторая корбка до: " + box.getWeightList());
            for(T t: box.getFruitList()){
                this.getFruitList().add(t);
            }
            box.getFruitList().clear();
            System.out.println("Первая коробка после: " + this.getWeightList());
            System.out.println("Вторая корбка после: " + box.getWeightList());
        }



        public T[] getFruitArray() {
            return fruitArray;
        }

        public ArrayList<T> getFruitList() {
            return fruitList;
        }
    }