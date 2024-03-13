package org.example.BusinessLogic;
import org.example.DataModels.Polynom;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void add() {
      Polynom p1=new Polynom("4+5x^2+3.6x^7+2.5x^10");
      Polynom p2=new Polynom("7+2.5x^1-8x^7+2x^8-2.8x^10");
      Operations op=new Operations();
      String expectedresult="11.0+2.5x+5.0x^2-4.4x^7+2.0x^8-0.29999995x^10";
      Polynom actualResult=op.add(p1,p2);
      String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }
    @Test
    void addFail()
    {
        Polynom p1=new Polynom("2+3.6x^2+2.5x^5-3.6x^7");
        Polynom p2=new Polynom("");
        Operations op=new Operations();
        String expectedresult="5+3.6x^2+5x^4";
        Polynom actualResult=op.add(p1,p2);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);

    }

    @Test
    void substract() {
        Polynom p1=new Polynom("4+3x^1-12x^6+7x^8");
        Polynom p2=new Polynom("12-3.5x^2+4x^3-5.5x^6");
        Operations op=new Operations();
        String expectedresult="-8.0+3.0x+3.5x^2-4.0x^3-6.5x^6+7.0x^8";
        Polynom actualResult=op.substract(p1,p2);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }
    @Test
    void substractFail() {
        Polynom p1=new Polynom("2+3.6x^2+2.5x^5-3.6x^7");
        Polynom p2=new Polynom("4+3x^1-12x^6+7x^8");
        Operations op=new Operations();
        String expectedresult="5+3.6x^2+5x^4";
        Polynom actualResult=op.add(p1,p2);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }


    @Test
    void multiply() {
        Polynom p1=new Polynom("4+3x^1-12x^6+7x^8");
        Polynom p2=new Polynom("12-3.5x^2+4x^3-5.5x^6");
        Operations op=new Operations();
        String expectedresult="48.0+3.0x-3.5x^2+4.0x^3+66.0x^6+7.0x^8";
        Polynom actualResult=op.multiply(p1,p2);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }
    @Test
    void multiplyFail(){
        Polynom p1=new Polynom("4+3x^1-12x^6+7x^8");
        Polynom p2=new Polynom("12-3.5x^2+4x^3-5.5x^6");
        Operations op=new Operations();
        String expectedresult="40+3.0x-3.5x^2+4.0x^3+66.0x^6";
        Polynom actualResult=op.multiply(p1,p2);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);


    }

    @Test
    void integrate() {
        Polynom p1=new Polynom("2+3.6x^2+2.5x^5-3.6x^7");
        Operations op=new Operations();
        String expectedresult="2.0x+1.2x^3+0.42x^6-0.45x^8";
        Polynom actualResult=op.integrate(p1);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }
    @Test
    void integrateFail() {
        Polynom p1=new Polynom("2+3.6x^2+2.5x^5-3.6x^7");
        Operations op=new Operations();
        String expectedresult="2x+12x^3+0.42x^6-0.45x^8";
        Polynom actualResult=op.integrate(p1);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }

    @Test
    void derive() {
        Polynom p1=new Polynom("3.3+5x^4+3x^5+2x^10");
        Operations op=new Operations();
        String expectedresult="20.0x^3+15.0x^4+20.0x^9";
        Polynom actualResult=op.derive(p1);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }
    @Test
    void deriveFail() {
        Polynom p1=new Polynom("3.3+5x^4+3x^5+2x^10");
        Operations op=new Operations();
        String expectedresult="x^3+15.0x^4+20.0x^6";
        Polynom actualResult=op.derive(p1);
        String actualResultprinted=actualResult.readHashmap(actualResult);
        Assert.assertEquals(actualResultprinted,expectedresult);
    }


}