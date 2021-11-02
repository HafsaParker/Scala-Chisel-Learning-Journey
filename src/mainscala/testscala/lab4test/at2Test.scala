package lab4task
import chisel3._
import chisel3.util
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random
import ALUOP._
class at2Test extends FreeSpec with ChiselScalatestTester {
    "at2 Test" in {
        test(new ImmdValGen()){c=>
        val array = Array("h00a00093","h00210663","h00a02023","h004000ef","h0000c537")
        for (i<-0 until 100){
            //val src1 = Random.nextLong() & 0xFFFFFFFFL
            val op  = Random.nextInt(4)
            val xyz = array(op)
            val result = xyz match{
                case "h00a00093" => 10.U
                case "h00210663" => 12.U
                //case "h00210263" => 4.U
                case "h00a02023" => 0.U
                case "h004000ef"=>4.U
                case "h0000c537" =>12.U
                
                case _ => 0.U
                
            }
            println("xyz",xyz)
            println("result",result)
            c.io.instr.poke(xyz.U)
            c.io.immd_se.expect(result.asUInt)
        }
        

        }
    }
}