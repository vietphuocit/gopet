import javax.microedition.lcdui.Graphics;

public final class as {
   private String[] a;
   private int a;
   private int b;
   private int c;

   public final void a(String var1) {
      this.c = v.b.a() - 1;
      this.a = v.b.a(var1);
      if (this.a > 80) {
         int var2;
         int var3;
         for(var2 = this.a; var2 >= 40; var2 -= 10) {
            var3 = this.a * this.c / var2;
            if (var2 / var3 <= 2) {
               this.a = var2;
               break;
            }
         }

         this.a = v.b.a(var1, this.a);
         this.a = 0;

         for(var2 = 0; var2 < this.a.length; ++var2) {
            var3 = v.b.a(this.a[var2]);
            if (this.a < var3) {
               this.a = var3;
            }
         }

         this.b = this.a.length * this.c + 8;
      } else {
         this.a = new String[1];
         this.a[0] = var1;
         this.b = this.c + 8;
      }

      this.a = this.a < 30 ? 36 : this.a + 6;
   }

   public final void a(Graphics var1, int var2, int var3) {
      if (this.a != null) {
         var2 -= this.a >> 1;
         var3 = var3 - this.b - 6;
         var1.translate(var2, var3);
         b(var1, this.a, this.b);

         for(int var4 = 0; var4 < this.a.length; ++var4) {
            if (var4 < this.a.length) {
               v.b.a(var1, this.a[var4], this.a >> 1, 2 + var4 * this.c, 17);
            }
         }

         a(var1, var2, var3, this.a, this.b);
         var1.translate(-var2, -var3);
      }
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      int var10001 = var3;
      var3 >>= 1;
      var1 = var10001;
      var0.setColor(0);
      var0.drawLine(6, 0, var1 - 6, 0);
      var0.fillRect(0, 6, 1, var4 - 12);
      var0.fillRect(6, var4 - 1, var1 - 12, 1);
      var0.fillRect(var1 - 1, 6, 1, var4 - 12);
      var0.drawRegion(v.a, 0, 0, 6, 6, 0, 0, 0, 0);
      var0.drawRegion(v.a, 7, 0, 6, 6, 0, var1 - 6, 0, 0);
      var0.drawRegion(v.a, 0, 6, 6, 6, 0, 0, var4 - 6, 0);
      var0.drawRegion(v.a, 7, 6, 6, 6, 0, var1 - 6, var4 - 6, 0);
      var0.drawRegion(v.a, 2, 12, 9, 6, 0, var3, var4 - 1, 17);
   }

   public static void b(Graphics var0, int var1, int var2) {
      var0.setColor(16777215);
      var0.fillRect(6, 0, var1 - 12, 3);
      var0.fillRect(6, var2 - 3, var1 - 12, 3);
      var0.fillRect(0, 6, 3, var2 - 12);
      var0.fillRect(var1 - 3, 6, 3, var2 - 12);
      var0.fillRect(3, 3, var1 - 6, var2 - 6);
   }
}
