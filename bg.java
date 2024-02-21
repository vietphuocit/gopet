import java.util.Vector;

public class bg implements bm, go {
   bi[] a = new bi[2];
   int[] a = new int[2];
   int[] b = new int[2];
   int[] c = new int[2];
   public boolean a;
   Vector a = new Vector();
   public bp a;
   public boolean b;
   public boolean c = false;
   private int a;
   private int b;
   private int c;
   private cx[] a;

   private int a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (var1 == this.a[var2]) {
            return var2;
         }
      }

      return 1;
   }

   final void a(ez var1) {
      int var2 = var1.a().readInt();
      var2 = this.a(var2);
      int var3 = var1.a().readInt();
      int var4 = var1.a().readInt();
      this.a(var3, var4);
      switch(var1.a().readByte()) {
      case 1:
         this.a.addElement(new bh(this, 0, var2, (Object)null));
      case 2:
      case 3:
      default:
         break;
      case 4:
         var1.a().readInt();
         var1.a().readUTF();
         var3 = var1.a().readInt();
         this.a.addElement(new bh(this, 5, var2, new Integer(var3)));
      }

      var3 = var1.a().readInt();

      for(var4 = 0; var4 < var3; ++var4) {
         var2 = var1.a().readInt();
         var2 = this.a(var2);
         int var5 = var1.a().readInt();
         var1.a().readUTF();
         var1.a().readInt();
         var1.a().readInt();
         var1.a().readInt();
         int var6 = var1.a().readInt();
         int var7 = var1.a().readInt();
         var1.a().readInt();
         var1.a().readInt();
         int[] var8;
         if (var5 < 0) {
            var8 = new int[]{var6, var7};
            this.a.addElement(new bh(this, 4, var2, var8));
         } else if (var5 >= 0 && var5 <= 2) {
            var8 = new int[]{var5, var6};
            this.a.addElement(new bh(this, 1, var2, var8));
         } else if (var5 >= 101 && var5 < 125) {
            var5 = var5 - 101 + 8;
            var8 = new int[]{var5, var6, var7};
            this.a.addElement(new bh(this, 6, var2, var8));
         } else if (var5 >= 125) {
            var8 = new int[]{var5, var6, var7};
            this.a.addElement(new bh(this, 11, var2, var8));
         }
      }

   }

   final void a() {
      if (!this.a.isEmpty() && !this.a) {
         bh var1 = (bh)this.a.elementAt(0);
         this.a = true;
         var1.a();
         this.a.removeElementAt(0);
      }

   }

   public final void a(ez var1, boolean var2) {
      if (var2) {
         ez var8 = var1;
         bg var7 = this;
         this.a = var1.a().readInt();
         var1.a().readByte();
         this.c = var1.a().readInt();
         this.b = var1.a().readInt();
         byte var3 = var1.a().readByte();
         this.a = new cx[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var8.a().readUTF();
            String var6 = var8.a().readUTF();
            var7.a[var4] = new cx();
            var7.a[var4].a = 0;
            var7.a[var4].a = var5;
            var7.a[var4].b = var6;
         }

         if (var7.a[0] == eg.a.a) {
            ((bx)eg.a).h();
         }

         var7.a.addElement(new bh(var7, 7, (var7.a(var7.a) + 1) % 2, (Object)null));
         var7.a.addElement(new bh(var7, 9, 0, (Object)null));
         var7.a.addElement(new bh(var7, 8, 0, (Object)null));
      } else {
         this.a = var1.a().readInt();
         var1.a().readByte();
         this.a.addElement(new bh(this, 7, (this.a(this.a) + 1) % 2, (Object)null));
         this.a.addElement(new bh(this, 9, 0, (Object)null));
      }

      this.a.addElement(new bh(this, 2, 0, (Object)null));
   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 5:
         eg.a(11, 0, ed.a(11));
      default:
      }
   }

   final void a(int var1, int var2) {
      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].a) {
            this.a[var3].b = var2;
            this.a[var3].a = var1;
            this.a[var3].a = System.currentTimeMillis();
         }
      }

   }

   public final void b() {
      this.a = false;
   }

   public final void c() {
      this.a.addElement(new bh(this, 9, 0, this.a));
      this.a.addElement(new bh(this, 2, 0, (Object)null));
   }

   static int a(bg var0) {
      return var0.c;
   }

   static int b(bg var0) {
      return var0.b;
   }

   static cx[] a(bg var0) {
      return var0.a;
   }

   static int c(bg var0) {
      return var0.a;
   }
}
