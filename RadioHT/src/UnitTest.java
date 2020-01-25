/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author craxt
 */
public class UnitTest extends Radio{
    private radio = radio;
    public UnitTest() {
        radio = new radio();
    }
    
   
    public  void onOff() {
        asserttrue(Radio.OnOff(1))
        sserttrue(Radio.OnOff(0))
    }
    
    
    public void cambiarFrecuencia() {
        asserttrue(Radio.cambiarFrecuencia(1))
        sserttrue(Radio.cambiarFrecuencia(0))
    }
    
    
    public void estado() {
         Assert.IsTrue(!string.IsNullOrEmpty(radio.Text));
        Assert.IsTrue(!string.IsNullOrEmpty(radio.Title));
        Assert.IsTrue(!string.IsNullOrEmpty(radio.HRef));
        Assert.AreEqual(expectedText, radio.Text);
        Assert.AreEqual(expectedTitle, radio.Title);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
