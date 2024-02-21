import javax.microedition.lcdui.Image;

public final class bv {
   public static int a;
   public static long a;
   static int b;
   static long b;
   br a;

   public bv(br var1) {
      this.a = var1;
   }

   public final void a() {
      bc.a.drawRegion(v.e, a * 14, 0, 14, 14, 0, 2, 1, 0);
      v.d().a(bc.a, br.a, 17, 4, 0);
      bc.a.drawImage(this.a.a, bc.f, 1, 0);
      v.d().a(bc.a, br.b, bc.f + 15, 4, 0);
      long var1;
      if ((var1 = System.currentTimeMillis()) - a > 100L) {
         a = (a + 1) % 5;
         a = var1;
      }

   }

   public final void a(int var1) {
      this.a();
      bc.a.drawImage(this.a.b, bc.f << 1, 1, 0);
      v.d().a(bc.a, String.valueOf(var1), (bc.f << 1) + 15, 4, 0);
   }

   public static void a(Image var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.getWidth() >> 1;
      bc.a.drawRegion(var0, b * var5, 0, var5, var0.getHeight(), var3, var1, var2, var4);
      long var6;
      if ((var6 = System.currentTimeMillis()) - b >= 200L) {
         b = var6;
         b = (b + 1) % 2;
      }

   }

   public final void a(Image var1, int var2, int var3, int var4) {
      a(var1, var2, var3, var4, 0);
   }
}
