package lab3task
import org.scalatest._
import chiseltest._
import chisel3._
class as2Test extends FreeSpec with ChiselScalatestTester{
    "as2 Test" in {
        test (new ImmdValGen()){c=>
        c.io.instr.poke("h004000ef".U)
        c.clock.step(20)
        c.io.immd_se.expect(4.U)
        
        }
    }


    
}
//h00100093 --> 1 (i type)
//h00210663 --> 12 (branch)
//h004000ef --> 4 (jtype) ?
//h00a02023 --> 0 (stype)
//h0000c537 --> 12 (u type)
