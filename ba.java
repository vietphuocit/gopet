import java.util.Random;

public final class ba extends gh {
   private int b;
   private int c;
   private int d;
   private int e;
   private int[] a;
   private int[] b;
   private Random a;
   private long a;
   private long b;
   private int f = 0;

   public final void a() {
      super.a();
      this.d = 0;
      this.a = new Random(System.currentTimeMillis());
      this.c();
   }

   private void c() {
      this.e = 0;
      this.a = new int[10];
      this.b = new int[10];
      this.b = this.a.nextInt() % (bc.d - 20) + bc.d;
      this.c = this.a.nextInt() % (bc.e - 20) + bc.e;

      for(int var1 = 0; var1 < 10; ++var1) {
         this.a[var1] = this.a.nextInt() % 50 + this.b;
         this.b[var1] = this.a.nextInt() % 50 + this.c;
      }

   }

   public final void b() {
      for(int var3 = 0; var3 < 10; ++var3) {
         int var1 = this.b + (this.a[var3] - this.b) * this.e / 10;
         int var2 = this.c + (this.b[var3] - this.c) * this.e / 10;
         bc.a.drawRegion(v.g, this.f * 14, 0, 14, 14, 0, var1, var2, 0);
      }

   }

   public final void a(long var1) {
      if (var1 - this.b > 100L) {
         this.f = (this.f + 1) % 5;
         this.b = var1;
      }

      if (var1 - this.a >= 0L) {
         this.a = var1;
         ++this.e;
         if (this.e > 10) {
            this.c();
            ++this.d;
            if (this.d > 5) {
               this.a = false;
            }
         }
      }

   }
}
