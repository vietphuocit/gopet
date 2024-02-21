import javax.microedition.lcdui.Image;

public class da extends ff {
   private int a;
   private long a;

   public da(Image var1) {
      super(var1);
   }

   public final void f() {
      this.a();
      if (this.e) {
         bc.a.drawImage(br.d, this.r - 6 + this.a, this.s + (this.u - 14) / 2, 0);
         long var1;
         if ((var1 = System.currentTimeMillis()) - this.a >= 200L) {
            this.a = var1;
            if (this.a == -2) {
               this.a = 0;
               return;
            }

            this.a = -2;
         }
      }

   }
}
