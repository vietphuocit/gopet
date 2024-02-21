import javax.microedition.lcdui.Image;

public final class ar extends fs {
   public Image[] a = new Image[9];
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;

   public ar() {
      super(true);
      this.e = true;
   }

   public final void g() {
      this.a = this.a[0].getWidth() + this.a[1].getWidth() + this.a[2].getWidth();
      this.b = this.a[0].getHeight() + this.a[3].getHeight() + this.a[6].getHeight();
      this.c = bc.b - this.a >> 1;
      this.d = bc.c - this.b >> 1;
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      bc.a.translate(this.c, this.d);
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         bc.a.drawImage(this.a[var3], var1, var2, 0);
         if (var3 % 3 == 2) {
            var2 += this.a[var3].getHeight();
            var1 = 0;
         } else {
            var1 += this.a[var3].getWidth();
         }
      }

      bc.a.translate(-this.c, -this.d);
   }

   public final boolean a(int var1, int var2) {
      if (a == null && var1 == 1) {
         this.h();
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.e = var2;
   }

   private void h() {
      if (this.e < 0) {
         this.a((fs)null);
      } else {
         j.e_();
         ez var1;
         (var1 = new ez(81)).a(65);
         eu.a.a(var1);
         var1.a();
      }
   }

   public final void a(int var1, int var2) {
      if (a == null) {
         this.h();
      } else {
         super.a(var1, var2);
      }
   }
}
