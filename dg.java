import javax.microedition.lcdui.Image;

public final class dg extends fy {
   private Image a;
   private final int a;
   public boolean a = true;
   private ce a;
   private String a;

   public dg(br var1) {
      this.a = gj.a.a();
      this.u = 77;
      int var2 = gj.a.a("Level 10000");
      this.t = 43;
      if (var2 > this.t) {
         this.t = var2;
      }

      this.h = false;
   }

   public final void a(ce var1) {
      this.a = var1;
   }

   public final void f() {
      bc.a.translate(this.r, this.s);
      int var1 = this.a;
      int var2;
      if (this.a == null) {
         this.a = br.a.a(this.a.a);
      } else {
         var2 = this.t - (this.a.getWidth() >> 1) >> 1;
         br.a.a(this.a, var2, var1, 0);
         String var3 = null;
         switch(this.a.b) {
         case 1:
            var3 = "(fire)";
            break;
         case 2:
            var3 = "(tree)";
            break;
         case 3:
            var3 = "(rock)";
            break;
         case 4:
            var3 = "(thunder)";
            break;
         case 5:
            var3 = "(water)";
            break;
         case 6:
            var3 = "(dark)";
            break;
         case 7:
            var3 = "(light)";
         }

         if (var3 != null) {
            gj.a.a(bc.a, var3, var2 + 25, var1, 0);
         }
      }

      if (this.a) {
         var1 += 37;
         gj.a.a(bc.a, "Cấp " + this.a.b, this.t >> 1, var1, 17);
         var1 += this.a;
         var2 = 50;
         if (50 > this.t) {
            var2 = this.t;
         }

         int var10 = this.t - var2 >> 1;
         bc.a.setColor(3872520);
         bc.a.fillRect(var10, var1, var2, 1);
         bc.a.fillRect(var10, var1 + 4, var2, 1);
         bc.a.fillRect(var10 - 1, var1 + 1, 1, 3);
         bc.a.fillRect(var10 + var2, var1 + 1, 1, 3);
         bc.a.setColor(16039947);
         bc.a.fillRect(var10, var1 + 1, var2, 3);
         var2 = (int)((this.a.a - this.a.c) * (long)var2 / (this.a.b - this.a.c));
         bc.a.setColor(1740031);
         bc.a.fillRect(var10, var1 + 1, var2, 3);
         var1 += 5;
         if (this.a == null) {
            long var6 = this.a.a - this.a.c;
            long var8 = this.a.b - this.a.c;
            this.a = au.d(var6) + "/" + au.d(var8);
         }

         v.d().a(bc.a, this.a, var10, var1, 0);
      }

      bc.a.translate(-this.r, -this.s);
   }

   public final boolean a(int var1, int var2) {
      switch(var2) {
      case -4:
         return true;
      case -3:
         return true;
      default:
         return super.a(var1, var2);
      }
   }
}
