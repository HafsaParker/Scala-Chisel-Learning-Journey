package lab1_tasks
import org.scalatest._
import chiseltest._
import chisel3._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class lastTask_Test extends FreeSpec with ChiselScalatestTester{
  
    "lastTask Test" in {
    test(new lastTask(3)){ c =>


      c.io.reload.poke(true.B)
      c.clock.step(30)
      

    }

  }
}