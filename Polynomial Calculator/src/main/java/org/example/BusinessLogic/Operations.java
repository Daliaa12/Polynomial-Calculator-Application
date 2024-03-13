package org.example.BusinessLogic;
import org.example.DataModels.Polynom;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
public class Operations {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static Polynom add(Polynom p1, Polynom p2) {
        Polynom result = new Polynom();
        result=p2;
        for (HashMap.Entry<Integer,Float> entry : p1.monom.entrySet())
        {
            if ( result.monom.containsKey(entry.getKey()))
            {
                Float s=entry.getValue()+result.monom.get(entry.getKey());
                result.monom.put(entry.getKey(),s);
            }
            else result.monom.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
    public static Polynom substract(Polynom p1, Polynom p2) {
        Polynom result = new Polynom();
        result=p1;
        for(Map.Entry<Integer, Float> entry: p2.monom.entrySet()) {
                if (result.monom.containsKey(entry.getKey())) {
                    Float s=-entry.getValue()+result.monom.get(entry.getKey());
                    result.monom.put(entry.getKey(),s);
                }
                else result.monom.put(entry.getKey(),-entry.getValue());
            }
        return result;
        }
    public static Polynom multiply(Polynom p1, Polynom p2) {
        Polynom result = new Polynom();
        result=p2;
        for (HashMap.Entry<Integer,Float> entry : p1.monom.entrySet())
        {
            if ( result.monom.containsKey(entry.getKey()))
            {
                Float s=entry.getValue()*result.monom.get(entry.getKey());
                float rounded = (float) (Math.round(s * 100.0) / 100.0);
                result.monom.put(entry.getKey(),rounded);
            }
            else result.monom.put(entry.getKey(),entry.getValue());
        }
        return result;
    }
    public static Polynom integrate(Polynom p1)
    {
        Polynom result= new Polynom();
        for (HashMap.Entry<Integer,Float> entry : p1.monom.entrySet())
        {
                float coeff = entry.getValue() * ((float) 1 / (entry.getKey() + 1));
                float rounded = (float) (Math.round(coeff * 100.0) / 100.0);
                result.monom.put(entry.getKey() + 1, rounded);
        }
        return result;
    }
    public static Polynom derive(Polynom p1)
    {
        Polynom result= new Polynom();
        for (HashMap.Entry<Integer,Float> entry : p1.monom.entrySet())
        {
                float coeff=entry.getValue()*entry.getKey();
                float rounded = (float) (Math.round(coeff * 100.0) / 100.0);
                result.monom.put(entry.getKey()-1,rounded);
        }
        return result;
    }
    //Main used for back-end testing
    public static void main(String[] args) {
        //Polynom p1 = new Polynom("x^4+6x^8-2x^10+6x^0");
        Polynom p1=new Polynom("5+3y^5-2y^10");
        //Polynom p2 = new Polynom("3.3x^0+5x^4+3x^5+2x^10");
        Polynom p2 = new Polynom("y^1");
        Operations op = new Operations();
        Polynom p3 = op.add(p1,p2);
        for (HashMap.Entry<Integer,Float> entry : p3.monom.entrySet())
        System.out.println("Key = " + entry.getKey() +
        ", Value = " + entry.getValue());
    }
}

