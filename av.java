import javax.microedition.lcdui.Image;

public final class av extends fs implements Runnable {
   private int a;
   private int b = 40;
   private Image a;
   private byte[][] a;
   private byte[] a;
   private byte[] b;
   private byte a;
   private boolean a;
   private Image c;

   public av(int var1) {
      super(true);
      this.a = var1;
      if (var1 == 0) {
         gi.a(gj.a);
         gj.b();
         this.a(0);
      } else {
         if (var1 == 1) {
            this.a(1);
            this.a = new byte[][]{{0, 16}, {17, 12}, {29, 14}, {43, 15}, {64, 10}, {75, 12}, {88, 5}, {97, 6}, {105, 6}, {113, 6}};
            this.a = new byte[10];
            this.b = new byte[]{0, -2, 0, 3};
         }

      }
   }

   public final void a(int var1, boolean var2) {
      super.a(var1, var2);
      this.a = false;
      (new Thread(this)).start();
   }

   public final void h_() {
      switch(this.a) {
      case 0:
         if (this.b <= 0 && this.a) {
            z var3 = new z();
            byte var2 = 0;
            var3.a(var2, false);
            return;
         }

         --this.b;
         return;
      case 1:
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.a[var1] > 0) {
               --this.a[var1];
            }
         }

         if (this.a < 10) {
            this.a[this.a] = 3;
         }

         ++this.a;
         if (this.a > 15) {
            this.a = 0;
         }
      default:
      }
   }

   public final void g_() {
      int var1;
      int var2;
      switch(this.a) {
      case 0:
         bc.a.setColor(0);
         bc.a.fillRect(0, 0, bc.b, bc.c);
         bc.a.drawImage(this.c, bc.d, bc.e, 3);
         bc.a.setColor(16736256);
         var1 = bc.a % 40;
         var2 = bc.e + this.c.getHeight() / 2 + 5;
         if (var1 > 30) {
            bc.a.fillRect(bc.d + 8, var2, 4, 4);
         }

         if (var1 > 20) {
            bc.a.fillRect(bc.d - 2, var2, 4, 4);
         }

         if (var1 > 10) {
            bc.a.fillRect(bc.d - 12, var2, 4, 4);
            return;
         }
         break;
      case 1:
         bc.a.setColor(0);
         bc.a.fillRect(0, 0, bc.b, bc.c);
         var1 = this.a.getHeight();

         for(var2 = 0; var2 < 10; ++var2) {
            bc.a.drawRegion(this.a, this.a[var2][0], 0, this.a[var2][1], var1, 0, bc.b - this.a.getWidth() - 10 + this.a[var2][0], bc.c - this.b[this.a[var2]] - 5, 36);
         }
      }

   }

   public static void h() {
      ez.b = false;
      gg.a((byte)1);
      if (eu.a != null) {
         eu.a.b = false;
      }

      if (gj.b != null) {
         gj.b = new fl(gj.b, -16777216);
      }

   }

   private void a(int var1) {
      try {
         if (var1 != 0) {
            if (var1 == 1) {
               gi.a("/common.dat");
               this.a = gi.a(15);
            }

            return;
         }

         this.c = Image.createImage("/meLogo.png");
      } catch (Exception var2) {
      }

   }

   public final void run() {
      switch(this.a) {
      case 0:
         j.a = new j();
         h();
         gj.a();
         gi.a(5);
         gi.a(6);
         gj.a = gi.a(0);
         gj.a = new gs(gi.a(7), 6);
         v.b();
         v.a();
      default:
         this.a = true;
      }
   }
}
