package Ejercicio29.test;

import Ejercicio29.BolaDragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BolaDragonTest {
   @Before
    public void resetBolaDragon(){
       BolaDragon.reset();
   }
    @Test
    public void test1(){
        try {
            for (int i = 1; i<= 7;i++){
              BolaDragon x =  BolaDragon.crearBolaDragon();
              assertEquals(i,x.getNumero());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test(expected = java.lang.Exception.class)
    public void test2() throws Exception{
        for (int i = 0;i<8;i++){
            BolaDragon x = BolaDragon.crearBolaDragon();
        }
        fail("No se ha lanzado el error esperado    ");

    }

}