import javax.microedition.lcdui.Image;

public final class bb extends gh {
   private byte a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private String[] a;
   private long a;
   private Image a;
   private String a;

   public bb(String var1) {
      this.a = gj.b.a(var1, bc.b >> 1);
      if (this.a.length > 0) {
         this.e = gj.b.a(this.a[0]) + 4;

         for(int var3 = 1; var3 < this.a.length; ++var3) {
            int var2;
            if ((var2 = gj.b.a(this.a[var3]) + 4) > this.e) {
               this.e = var2;
            }
         }

         this.d = bc.b - this.e;
         this.f = gj.b.a() * this.a.length + 2;
      }

      this.a = null;
      this.a = "";
   }

   public final void a() {
      this.a = true;
      this.a = 0;
      this.b = bc.c - gg.m;
      this.c = bc.c - gg.m - this.f;
      if (bc.a() != null) {
         ;
      }
   }

   public final void b() {
      bc.a.setColor(14328834);
      bc.a.fillRect(this.d, this.b, this.e, this.f);

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         gj.b.a(bc.a, this.a[var1], this.d + 2, this.b + 1 + var1 * gj.b.a(), 0);
      }

      if (this.a != null) {
         bc.a.drawImage(this.a, bc.b - this.a.getWidth() >> 1, this.b + this.a.length * gj.b.a(), 0);
      } else {
         if (this.a.trim().length() > 0) {
            this.a = v.a(this.a, (byte)3);
         }

      }
   }

   public final void a(long var1) {
      switch(this.a) {
      case 0:
         if (au.a(this.b - this.c) >= 3) {
            this.b -= 3;
            return;
         }

         this.b = this.c;
         this.a = 1;
         this.a = var1;
         return;
      case 1:
         if (var1 - this.a >= 3000L) {
            this.a = 2;
            return;
         }
         break;
      case 2:
         if (au.a(bc.c - gg.m - this.b) >= 3) {
            this.b += 3;
            return;
         }

         this.a = false;
         return;
      case 3:
         if (au.a(this.b - this.c) >= 6) {
            this.b += 6;
            return;
         }

         this.b = this.c;
         this.a = 4;
         this.a = var1;
         return;
      case 4:
         if (var1 - this.a >= 2500L) {
            this.a = 5;
            return;
         }
         break;
      case 5:
         this.a = null;
         this.a = false;
      }

   }
}
