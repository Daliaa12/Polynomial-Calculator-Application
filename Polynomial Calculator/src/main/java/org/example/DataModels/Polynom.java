package org.example.DataModels;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Polynom  {
    public HashMap<Integer,Float> monom=new HashMap<>();
    public Polynom(String s) {
            String monomialFormat = "([+-]?[\\d\\.]*[a-zA-Z]?\\^?\\d*)";
            String monomialPartsFormat = "([+-]?[\\d\\.]*)([a-zA-Z]?)\\^?(\\d*)";
            Pattern p1 = Pattern.compile(monomialFormat);
            Matcher m1 = p1.matcher(s);
            while (!m1.hitEnd()) {
                m1.find();
                Pattern p2 = Pattern.compile(monomialPartsFormat);
                Matcher m2 = p2.matcher(m1.group());
                if (m2.find()) {
                    float coefficient;
                    try {
                        String coef = m2.group(1);
                        if (isNumeric(coef)) {
                            coefficient = Float.valueOf(coef);
                        } else {
                            coefficient = Float.valueOf(coef + "1");
                        }
                    } catch (IllegalStateException e) {
                        coefficient = 0.0F;
                    }
                    int exponent;
                    try {
                        String exp = m2.group(3);
                        if (isNumeric(exp))
                        {
                            exponent = Integer.valueOf(exp);
                        } else {
                            exponent = 0;
                        }
                    } catch (IllegalStateException e) {
                        exponent = 0;
                    }
                    monom.put(exponent,coefficient);
                }
            }
        }
    private static boolean isNumeric(String str) {

        return str.matches("[+-]*\\d*\\.?\\d+");
    }
    public Polynom()
    {
    }
    public String readHashmap(Polynom p1)
    {
        String polynomialString = "";
        boolean firstTerm = true;
        for (Map.Entry<Integer, Float> entry : p1.monom.entrySet())
        {
            Integer exponent = entry.getKey();
            Float coeff = entry.getValue();
            if (coeff == 0)
                continue;
            if (coeff > 0 && !firstTerm)
                polynomialString += "+";
            firstTerm = false;
            if (coeff != 1 || exponent == 0)
                polynomialString += Float.toString(coeff);
            if (exponent > 0)
            {
                polynomialString += "x";
                if (exponent > 1) {
                    polynomialString += "^" + exponent;
                }
            }
        }
        return polynomialString;
    }
}
