import javax.microedition.lcdui.Image;

public final class cj extends ci {
   public String a;
   private Image a;
   public boolean a;
   public int a;
   public int b;
   private int c;
   private long a;
   private final cg a;

   public cj(cg var1) {
      super(var1);
      this.a = var1;
      this.a = 1;
   }

   public final void a() {
      if (this.a != null) {
         byte var2 = this.b;
         int var3 = this.a.getWidth() / this.a;
         byte var4 = 0;
         int var5 = 0;
         switch(var2) {
         case 17:
            var4 = 24;
            var5 = this.t;
            break;
         case 20:
            var4 = 0;
            var5 = 0;
            break;
         case 24:
            var4 = 17;
            var5 = this.t >> 1;
         }

         bc.a.drawRegion(this.a, this.c * var3, 0, var3, this.a.getHeight(), 0, var5, 0, var4);
         long var7;
         if ((var7 = System.currentTimeMillis()) - this.a >= 200L) {
            this.a = var7;
            this.c = (this.c + 1) % this.a;
         }

      } else {
         Image var1;
         if ((var1 = br.a.a(this.a)) != null) {
            if (this.a) {
               var1 = gf.a(var1, var1.getHeight() << 1);
            }

            this.a = var1;
            this.c(this.t, var1.getHeight() + 4);
            cg.a(this.a).h();
         }

      }
   }
}
