public final class az extends gh {
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private long a;
   private boolean c;
   private int h;

   public az(int var1, int var2, boolean var3) {
      this.a = 1;
      this.f = var1;
      this.g = var2;
      this.b = true;
      this.c = var3;
   }

   public final void a(int var1) {
      super.a();
      this.h = 2000;
      this.a = System.currentTimeMillis();
   }

   public final void a() {
      this.a(2000);
   }

   public final void b() {
      bc.a.setColor(16777215);
      int var1 = bc.a.getTranslateX();
      int var2 = bc.a.getTranslateY();
      int var3;
      int var4;
      if (this.c) {
         var3 = eg.a.a.b;
         var4 = eg.a.b.b;
      } else {
         var3 = 0;
         var4 = 0;
      }

      bc.a.translate(-var3 + this.f, -var4 + this.g);
      bc.a.fillTriangle(0, 0, 0 + this.b, 0 + this.c, 0 + this.b + this.d, 0 + this.c + this.e);
      bc.a.translate(-var1, -var2);
   }

   public final void a(long var1) {
      if (var1 - this.a >= (long)this.h) {
         this.a = false;
      } else {
         this.b = au.b(400) - 100;
         this.c = au.b(400) - 100;
         this.d = au.b(60) - 30;
         this.e = au.b(60) - 30;
      }
   }
}
