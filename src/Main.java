import com.sun.jdi.DoubleValue;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args)
    {   // ArrayList<int> ghrg=new ArrayList<int>(); int is primitive data type.
        ArrayList<String> ArrayOfStrings=new ArrayList<String>();
        ArrayOfStrings.add("Edwin");

        ArrayList<IntClass>strArraylist=new ArrayList<IntClass>();
        strArraylist.add(new IntClass(54));
        Integer integer=new Integer(12);
        Double doubleValue=new Double(12.5);

        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();

        for(int i=0;i<10;i++)
        {
            integerArrayList.add(integer.valueOf(i));
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(integerArrayList.get(i).intValue());
        }

        ArrayList<Double> doubleArrayList=new ArrayList<Double>();

        for(double i=0.0;i<=10.0;i+=0.5)
        {
            doubleArrayList.add(doubleValue.valueOf(i));
            //OR
            //doubleArrayList.add(i);
        }
        for(int i=0 ;i<doubleArrayList.size();i++)
        {  Double value= doubleArrayList.get(i).doubleValue();
            System.out.println(value);
          //OR
            //System.out.println(doubleArrayList.get(i));
           //OR
           //System.out.println(doubleArrayList.get(i).doubleValue());


        }

    }
}
