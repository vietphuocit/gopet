import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class en implements ey {
   private ek a = new ek();
   public ex a;
   protected static en a;
   public eg a;
   private Hashtable a = new Hashtable();

   public static en a() {
      if (a == null) {
         a = new en();
      }

      return a;
   }

   public final void a() {
      ek var10000 = this.a;
      eu.c();
      eu.f();
      z.a = false;
   }

   public final void b() {
      this.a.a();
   }

   public final void c() {
      ek var10000 = this.a;
      ek.b();
   }

   public final void a(ez var1) {
      try {
         label642: {
            int var2;
            int var3;
            int var4;
            String var5;
            int var6;
            int var7;
            int var9;
            String var10;
            String var11;
            eg var10000;
            String var16;
            byte var23;
            byte[] var26;
            String var27;
            String var28;
            byte var30;
            int var33;
            String var34;
            int[] var39;
            Vector var43;
            String var49;
            eg var54;
            int var55;
            String var56;
            String var67;
            byte var68;
            ek var79;
            switch(var1.a) {
            case -36:
               if (var1.a().readByte() == 1) {
                  var79 = this.a;
                  if (eu.a != null) {
                     eu.a.a((Object)null);
                     eu.a = null;
                     return;
                  }
               } else {
                  this.a.a();
               }

               return;
            case 3:
               (j.a = new an()).d = var1.a().readInt();
               j.a.a = var1.a().readUTF();
               eu.a = var1.a().readUTF();
               var79 = this.a;
               var34 = z.a;
               j.a.a = var34;
               au.a(var34, 7);

               try {
                  if (j.a) {
                     c.a("nick", z.a);
                     c.a("pass", z.b);
                  } else {
                     c.a("nick");
                     c.a("pass");
                  }
               } catch (Exception var13) {
               }

               ah.b.removeAllElements();
               ah.a.removeAllElements();
               ah.c.removeAllElements();
               if (this.a == null) {
                  this.a = new eg();
                  var54 = this.a;
                  gi.a("/buttonicon.dat");
                  var54.a = new Image[2];
                  var54.a[0] = gi.a(1);
                  var54.a[1] = gi.a(2);
                  var54.a = gi.a(0);
               }

               a().a = new br();
               bc.a.a = (bd)a().a;
               return;
            case 4:
               var79 = this.a;
               j.c(var1.a().readUTF(), true);
               return;
            case 7:
               var43 = new Vector();

               while(var1.a().available() > 0) {
                  eh var73;
                  (var73 = new eh()).a = var1.a().readInt();
                  var73.b = var1.a().readInt();
                  var1.a().readBoolean();
                  var73.c = var1.a().readInt();
                  au.a((long)var73.c);
                  var43.addElement(var73);
               }

               j.a(var43);
               return;
            case 9:
               if (this.a != null) {
                  var2 = var1.a().readInt();
                  if ((var16 = var1.a().readUTF()).length() > 0) {
                     this.a.a(var2, var16);
                     return;
                  }
               }
               break;
            case 10:
               bc.a.w();
               j.c(var1.a().readUTF());
               return;
            case 20:
               byte var78 = var1.a().readByte();

               for(var2 = 0; var2 < var78; ++var2) {
                  ej var72;
                  (var72 = new ej()).a = var1.a().readInt();
                  var72.a = var1.a().readUTF();
                  var72.b = var1.a().readUTF();
                  var72.a = var1.a().readByte();
                  switch(var72.a) {
                  case 0:
                     ah.b.addElement(var72);
                     break;
                  case 1:
                  default:
                     ah.c.addElement(var72);
                     break;
                  case 2:
                  case 3:
                     ah.a.addElement(var72);
                  }
               }

               if (var78 != 0) {
                  bc.a();
                  fs.h(c.a(203));
                  return;
               }
               break;
            case 21:
               if ((var68 = var1.a().readByte()) == 0) {
                  var9 = var1.a().readInt();
                  var55 = var1.a().readInt();
                  var79 = this.a;
                  j.i();
               } else if (var68 == 1) {
                  bc.a().v();
                  j.a_(c.a(491));
               } else if (var68 == 2) {
                  var49 = var1.a().readUTF();
                  var79 = this.a;
                  j.f(var49);
               }
            case 96:
               ez var70 = var1;
               en var57 = this;

               try {
                  byte var18 = var70.a().readByte();
                  var23 = var70.a().readByte();
                  switch(var18) {
                  case 12:
                     var57.a(var70, var23);
                  case 0:
                     if (var23 != 10 && var23 != 11) {
                        var5 = var70.a().readUTF();
                        int var20;
                        if ((var20 = var70.a().readInt()) != 0) {
                           byte[] var22 = new byte[var20];
                           var70.a().read(var22);
                           Image var24 = Image.createImage(var22, 0, var22.length);
                           if (var23 != 4) {
                              v.a(var5, var24, var23);
                           }

                           return;
                        }
                     }

                     return;
                  default:
                     return;
                  }
               } catch (IOException var14) {
                  return;
               }
            case 23:
               var1.a().readByte();
               j.a.b = var1.a().readInt();
               var7 = var1.a().readInt();
               ed.a(j.a.b, var7);
               var3 = j.a.b;
               var26 = new byte[var1.a().readInt()];
               var1.a().read(var26);
               ed.a(var26, var3);
               return;
            case 24:
               if (j.a == null) {
                  j.a = new an();
               }

               this.a(true, var1);
               return;
            case 25:
               j.c(var1.a().readUTF(), true);
               return;
            case 27:
               if (this.a != null) {
                  var2 = var1.a().readInt();
                  byte var40 = var1.a().readByte();
                  var33 = var1.a().readInt();
                  if ((var4 = var1.a().readInt()) > 0) {
                     var39 = new int[var4];

                     for(var7 = 0; var7 < var4; ++var7) {
                        var39[var7] = var1.a().readInt();
                     }

                     var54 = this.a;
                     if (eg.a != null && var39 != null && var33 == eg.a.c) {
                        ds var17;
                        if ((var17 = eg.a(var2)) != null && var17.a && var39.length > 0) {
                           var17.a(var40, var39);
                        }

                        return;
                     }
                  }
               }
               break;
            case 29:
               if (this.a != null) {
                  j.a.b = var1.a().readInt();
                  j.a.c = var1.a().readInt();
                  var30 = var1.a().readByte();
                  var3 = var1.a().readInt();
                  var4 = var1.a().readInt();
                  var10000 = this.a;
                  eg.a();
                  br.b();
                  Integer var53 = (Integer)this.a.get(new Integer(j.a.b));
                  var6 = j.a.b;
                  if (var53 != null) {
                     var6 = var53;
                  }

                  ed var59 = new ed(var6, a().a, var3, var4);
                  bx var65 = new bx(this.a);
                  if (var30 >= 0) {
                     for(var7 = 0; var7 < var59.a.length; ++var7) {
                        if (var59.a[var7].a == var30) {
                           var3 = var59.a[var7].a;
                           var4 = var59.a[var7].b;
                           break;
                        }
                     }
                  }

                  this.a.a(var65, var59, j.a.b, var3, var4);
                  eg.a = var65;

                  while(var1.a().available() > 0) {
                     this.a(false, var1);
                  }

                  var65.d(0);
                  if (j.a.b != 12) {
                     var67 = c.a(666) + ' ' + j.a.c;
                     if (bc.b - 20 < v.b().a(var67)) {
                        var67 = c.a(666) + ' ' + j.a.c;
                     }

                     aw var51;
                     (var51 = new aw(var67)).a();
                     ea.e.addElement(var51);
                  }

                  ea.q();
                  return;
               }
               break;
            case 30:
               if (this.a != null) {
                  var2 = var1.a().readInt();
                  var1.a().readByte();
                  if ((var4 = var1.a().readInt()) <= 0) {
                     this.a.a(var2);
                  } else {
                     int[] var52 = new int[var4];

                     for(var6 = 0; var6 < var4; ++var6) {
                        var52[var6] = var1.a().readInt();
                     }

                     this.a.a(var2);
                  }

                  return;
               }
               break;
            case 31:
               if (j.a == null) {
                  j.a = new an();
               }

               j.a.d = var1.a().readInt();
               j.a.b = var1.a().readUTF();
               j.a.a = var1.a().readInt();
               (eg.a = c.a(j.a.d, (byte)j.a.a, this.a)).c(j.a.b);
               eg.a.b = var1.a().readByte();
               j.a = var1.a().readInt();
               return;
            case 34:
               while(true) {
                  label557:
                  do {
                     while(var1.a().available() > 0) {
                        switch(var1.a().readByte()) {
                        case 0:
                           continue label557;
                        }
                     }

                     return;
                  } while(this.a == null);

                  var3 = var1.a().readInt();
                  var4 = var1.a().readInt();
                  var33 = var1.a().readInt();
                  var7 = var1.a().readInt();
                  var2 = var1.a().readInt();
                  var56 = var1.a().readUTF();
                  if ("".equals(var56)) {
                     var56 = null;
                  }

                  var39 = new int[var9 = var1.a().readInt()];

                  for(var55 = 0; var55 < var9; ++var55) {
                     var39[var55] = var1.a().readInt();
                  }

                  var55 = var1.a().readInt();
                  int var66 = var1.a().readInt();
                  String[] var74 = null;
                  if (var66 != 0) {
                     var74 = new String[var66];

                     for(var9 = 0; var9 < var66; ++var9) {
                        var74[var9] = var1.a().readUTF();
                     }
                  }

                  ee var76;
                  (var76 = new ee(var2, this.a)).c(var1.a().readUTF());
                  var76.b(var1.a().readByte());
                  var76.a(new gn(var3, var4, var33, var7));
                  var76.e = var56;
                  if (var39.length > 2) {
                     var76.a((byte)0, var39);
                     var76.h = 10;
                  } else {
                     var76.b(-1L);
                  }

                  if (var74 != null) {
                     var76.a(var74, var55);
                  }

                  if (eg.a != null) {
                     eg.a.a(var76, var39[0], var39[1], false);
                     if (!var76.j) {
                        var76.e = true;
                     }
                  }
               }
            case 35:
               var27 = var1.a().readUTF();
               boolean var48 = var1.a().readBoolean();
               var28 = var1.a().readUTF();
               var16 = var1.a().readUTF();
               var79 = this.a;
               String var10002 = var28;
               var28 = var16;
               var16 = var10002;
               j.a.a(var27, var48, var16, var28);
               return;
            case 42:
               switch(var1.a().readByte()) {
               case 12:
                  byte var77;
                  j.a = new String[var77 = var1.a().readByte()];
                  j.b = new String[var77];
                  j.b = new byte[var77];
                  j.a = new byte[var77];

                  for(var3 = 0; var3 < var77; ++var3) {
                     j.a[var3] = var1.a().readByte();
                     j.a[var3] = var1.a().readUTF();
                     j.b[var3] = var1.a().readUTF();
                     j.b[var3] = var1.a().readByte();
                  }

                  return;
               case 13:
                  this.a.clear();
                  var55 = var1.a().readInt();

                  for(var3 = 0; var3 < var55; ++var3) {
                     var4 = var1.a().readInt();
                     var33 = var1.a().readInt();
                     this.a.put(new Integer(var4), new Integer(var33));
                  }
                  break label642;
               default:
                  return;
               }
            case 44:
               j.h();

               Vector var41;
               g var69;
               for(var41 = new Vector(); var1.a().available() > 0; var41.addElement(var69)) {
                  var68 = var1.a().readByte();
                  var69 = new g(var68);
                  if (var68 == 2 || var68 == 4) {
                     var69.a = var1.a().readByte();
                  }

                  var69.a = var1.a().readUTF();
                  var69.b = var1.a().readUTF();
                  var69.c = var1.a().readUTF();
                  if (var68 == 0) {
                     var69.d = var1.a().readUTF();
                  }
               }

               j.b(var41);
               return;
            case 45:
               fs var61;
               gq var62;
               gq var75;
               switch(var1.a().readByte()) {
               case 0:
                  j.a(var1.a().readUTF(), true);
                  return;
               case 1:
                  var5 = var1.a().readUTF();
                  bc.a();
                  fs.h(var5);
                  return;
               case 2:
                  var34 = var1.a().readUTF();
                  String var47 = var1.a().readUTF();
                  this.a.a(var34, var47);
                  return;
               case 3:
               default:
                  return;
               case 4:
                  var7 = var1.a().readInt();
                  var27 = var1.a().readUTF();
                  var61 = bc.a();
                  var62 = new gq(c.a(580), new eo(this, var7, var61));
                  var75 = new gq(c.a(300), new ep(this, var7, var61));
                  fh.a(var27, var62, (gq)null, var75, true);
                  return;
               case 5:
                  if (bc.a() == null) {
                     return;
                  }

                  var16 = var1.a().readUTF();
                  bb var42;
                  (var42 = new bb(var16)).a();
                  fs.e.addElement(var42);
                  return;
               case 6:
                  var33 = var1.a().readInt();
                  var67 = var1.a().readUTF();
                  var27 = var1.a().readUTF();
                  var61 = bc.a();
                  var62 = new gq(c.a(580), new eq(this, var33, var61));
                  var75 = new gq(c.a(300), new er(this, var33, var61));
                  j.a(var33, var67, var27, (byte)1);
                  if (fs.a != null) {
                     fs.a.c = var62;
                     fs.a.e = var75;
                  }

                  return;
               }
            case 48:
               this.a.a(var1.a().readUTF(), var1.a().readUTF());
               return;
            case 61:
               var1.a().readInt();
               var1.a().readLong();
               var1.a().readLong();
               var1.a().readLong();
               var79 = this.a;
               return;
            case 64:
               var4 = var1.a().readInt();
               var43 = new Vector();

               ap var58;
               for(var7 = 0; var7 < var4; ++var7) {
                  var58 = new ap(var1.a().readUTF().trim(), var1.a().readUTF().trim(), var1.a().readInt(), var1.a().readInt(), var1.a().readInt());
                  var43.addElement(var58);
               }

               for(var7 = 0; var7 < var4; ++var7) {
                  (var58 = (ap)var43.elementAt(var7)).a = var1.a().readBoolean();
                  var58.b = var1.a().readBoolean();
               }

               eu.a = var43;
               z.i_();
               fs var64;
               if (!((var64 = bc.a()) instanceof z) || !z.a) {
                  break;
               }

               ((z)var64).g();
               return;
            case 65:
               return;
            case 71:
               bc.a().v();
               var1.a().readByte();
               j.a_(var1.a().readUTF());
               return;
            case 72:
               if ((var30 = var1.a().readByte()) == -1) {
                  var30 = var1.a().readByte();
                  var34 = null;
               } else {
                  var34 = var1.a().readUTF();
               }

               ek var37 = this.a;
               switch(var30) {
               case 1:
                  j.d(var34);
                  return;
               case 2:
               case 9:
                  j.e(var34);
                  return;
               case 3:
               case 10:
                  fh.a(c.a(30), (gq)null, new gq(2, c.a(337), var34, var37), (gq)null, true);
                  return;
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               default:
                  return;
               }
            case 73:
               var30 = var1.a().readByte();
               var34 = var1.a().readUTF();
               var16 = var1.a().readUTF();
               var79 = this.a;
               j.a.a(var30, var34, var16);
               return;
            case 74:
               var49 = var1.a().readUTF();
               var10 = var1.a().readUTF();
               var11 = var1.a().readUTF();
               eu.a(var49, "sms://" + var10, new es(this, var11), new et(this));
               return;
            case 76:
               var79 = this.a;
               c.a();
               return;
            case 83:
               String var71 = var1.a().readUTF();
               bc.a.a.platformRequest(var71);
               return;
            case 122:
               af var8;
               ee var31;
               Vector var38;
               int var44;
               String[] var45;
               switch(var1.a().readByte()) {
               case 1:
                  if (this.a == null || j.b != 0) {
                     return;
                  }

                  var3 = var1.a().readInt();
                  boolean var35 = false;
                  var43 = fs.d;

                  for(var6 = 0; var6 < var43.size(); ++var6) {
                     fh var50;
                     if ((var50 = (fh)var43.elementAt(var6)) instanceof y && ((y)var50).a == var3) {
                        var35 = true;
                        break;
                     }
                  }

                  if (var35) {
                     return;
                  }

                  var1.a().readUTF();
                  String[] var29 = new String[var7 = var1.a().readInt()];

                  for(var44 = 0; var44 < var7; ++var44) {
                     var29[var44] = var1.a().readUTF();
                  }

                  var56 = var1.a().readUTF();
                  var1.a().readInt();
                  (new y(var3, var56, var29, eg.a.n - 54)).a(false);
                  if (eg.a != null) {
                     eg.a.p();
                  }

                  return;
               case 2:
                  if (this.a == null || (var3 = var1.a().readInt()) >= 0) {
                     return;
                  }

                  var10000 = this.a;
                  if ((var31 = (ee)eg.a(var3)) == null) {
                     return;
                  }

                  var33 = var1.a().readInt();
                  var31.b();

                  for(var6 = 0; var6 < var33; ++var6) {
                     var7 = var1.a().readInt();
                     var27 = var1.a().readUTF();
                     String[] var60 = new String[var44 = var1.a().readInt()];

                     for(var55 = 0; var55 < var44; ++var55) {
                        var60[var55] = var1.a().readUTF();
                     }

                     var10 = var1.a().readUTF();
                     y var32 = new y(var7, var10, var60, var31.n - var31.g);
                     var31.a(var27, var32);
                  }

                  var31.a();
                  return;
               case 3:
                  var3 = var1.a().readInt();
                  if (var1.a().readInt() == 0) {
                     j.c(var1.a().readUTF());
                  } else {
                     var28 = var1.a().readUTF();
                     var1.a().readUTF();
                     var39 = new int[var33 = var1.a().readInt()];
                     var45 = new String[var33];
                     byte[] var25 = new byte[var33];
                     gq[] var46 = new gq[var33];

                     for(var9 = 0; var9 < var33; ++var9) {
                        var39[var9] = var1.a().readInt();
                        var45[var9] = var1.a().readUTF();
                        var25[var9] = var1.a().readByte();
                        if (var25[var9] != 0) {
                           int[] var63;
                           (var63 = new int[2])[0] = var3;
                           var63[1] = var39[var9];
                           var46[var9] = new gq(43, c.a(419), var63, j.a);
                        }
                     }

                     j.a(var3, var28, var39, var45, var25, var46).a(true);
                  }

                  return;
               case 4:
               case 9:
               default:
                  return;
               case 5:
                  if (this.a == null || (var3 = var1.a().readInt()) >= 0) {
                     return;
                  }

                  var10000 = this.a;
                  if ((var31 = (ee)eg.a(var3)) == null) {
                     return;
                  }

                  var39 = new int[var33 = var1.a().readInt()];
                  var45 = new String[var33];

                  for(var2 = 0; var2 < var33; ++var2) {
                     var39[var2] = var1.a().readInt();
                     var45[var2] = var1.a().readUTF();
                  }

                  var31.a(var45, var39);
                  return;
               case 6:
                  var3 = var1.a().readInt();
                  var28 = var1.a().readUTF();
                  var33 = var1.a().readInt();
                  Vector var36 = new Vector();

                  for(var7 = 0; var7 < var33; ++var7) {
                     af var19 = new af(var1.a().readInt(), var1.a().readUTF(), var1.a().readUTF(), var1.a().readUTF(), var1.a().readByte());
                     var36.addElement(var19);
                  }

                  a(var3, var36, (byte)-1, var28);
                  return;
               case 7:
                  var44 = var1.a().readInt();
                  var49 = var1.a().readUTF();
                  String[] var21 = new String[var55 = var1.a().readInt()];
                  var26 = new byte[var55];

                  for(var33 = var55 - 1; var33 >= 0; --var33) {
                     var21[var33] = var1.a().readUTF();
                     var26[var33] = var1.a().readByte();
                  }

                  j.a(122, 7, var44, var49, var21, var26);
                  return;
               case 8:
                  var3 = var1.a().readInt();
                  var23 = var1.a().readByte();
                  var5 = var1.a().readUTF();
                  var6 = var1.a().readInt();
                  var38 = new Vector();

                  for(var2 = 0; var2 < var6; ++var2) {
                     var8 = new af(var1.a().readInt(), var1.a().readUTF(), var1.a().readUTF(), var1.a().readUTF(), var1.a().readByte());
                     var38.addElement(var8);
                     var8.b = var1.a().readBoolean();
                     if (var8.b) {
                        var8.b = var1.a().readUTF();
                        var8.c = var1.a().readUTF();
                        var1.a().readUTF();
                     }

                     var8.a = var1.a().readByte();
                     var8.c = var1.a().readBoolean();
                     var9 = var1.a().readInt();
                     var8.a = new int[var9];
                     var8.a = new String[var9];
                     var8.a = new byte[var9];

                     for(var55 = 0; var55 < var9; ++var55) {
                        var8.a[var55] = var1.a().readInt();
                        var8.a[var55] = var1.a().readUTF();
                        var8.a[var55] = var1.a().readByte();
                     }
                  }

                  a(var3, var38, var23, var5);
                  return;
               case 10:
                  var3 = var1.a().readInt();
                  var23 = var1.a().readByte();
                  var5 = var1.a().readUTF();
                  var6 = var1.a().readInt();
                  var38 = new Vector();

                  for(var2 = 0; var2 < var6; ++var2) {
                     var8 = new af(var1.a().readInt(), var1.a().readUTF(), var1.a().readUTF(), var1.a().readUTF(), var1.a().readByte());
                     var38.addElement(var8);
                     var8.b = var1.a().readBoolean();
                     if (var8.b) {
                        var8.b = var1.a().readUTF();
                        var8.c = var1.a().readUTF();
                        var1.a().readUTF();
                     }

                     var8.c = var1.a().readBoolean();
                  }

                  a(var3, var38, var23, var5);
                  return;
               case 11:
                  var2 = var1.a().readInt();
                  var3 = var1.a().readInt();
                  var4 = var1.a().readInt();
                  var5 = var1.a().readUTF();
                  var6 = var1.a().readInt();
                  var7 = var1.a().readInt();
                  (new cw(var2, var5, var3, var4, var6, var7)).a(false);
                  return;
               }
            case 125:
               switch(var1.a().readByte()) {
               case 1:
                  var9 = var1.a().readInt();
                  var10 = var1.a().readUTF();
                  var11 = var1.a().readUTF();
                  byte var12 = var1.a().readByte();
                  j.a(var9, var10, var11, var12);
                  return;
               default:
                  return;
               }
            default:
               if (this.a != null) {
                  this.a.a(var1);
               }
            }

            return;
         }
      } catch (Exception var15) {
         var15.printStackTrace();
      }

   }

   private void a(boolean var1, ez var2) {
      int var3 = var2.a().readInt();
      String var4 = var2.a().readUTF();
      byte var5 = var2.a().readByte();
      byte var6 = var2.a().readByte();
      byte var7 = var2.a().readByte();
      var2.a().readByte();
      byte var8 = -1;
      if (var1) {
         var8 = var2.a().readByte();
      }

      int var11 = var2.a().readInt();
      int var12 = var2.a().readInt();
      if (var8 >= 0 && eg.a != null) {
         ed var9 = eg.a.a;

         for(int var10 = 0; var10 < var9.a.length; ++var10) {
            if (var9.a[var10].a == var8) {
               var11 = var9.a[var10].a;
               var12 = var9.a[var10].b;
               break;
            }
         }
      }

      eg var13 = this.a;
      ds var10000;
      ds var18;
      if (eg.a == null) {
         var10000 = null;
      } else {
         if ((var18 = eg.a(var3)) == null) {
            (var18 = c.a(var3, var5, var13)).c(var4);
            eg.a.a(var18, var11, var12, false);
            var18.m = var11;
            var18.n = var12;
            eg.a.a.a(eg.a);
            var18.a = new gq(900, c.a(419), var13);
            var18.b(-1L);
            var18.b = var6;
         }

         var10000 = var18;
      }

      var18 = var10000;
      if (var10000 != null) {
         var18.a = var7;
      }

   }

   public static byte[] a(ez var0) {
      int var1;
      if ((var1 = var0.a().readInt()) <= 0) {
         return null;
      } else {
         byte[] var2 = new byte[var1];
         var0.a().read(var2);
         return var2;
      }
   }

   private void a(ez var1, byte var2) {
      try {
         switch(var2) {
         case 7:
            int var6 = var1.a().readInt();
            var1.a().readByte();
            var1.a().readInt();
            var1.a().readInt();
            var1.a().readInt();
            byte[] var4;
            Image var5 = Image.createImage(var4 = a(var1), 0, var4.length);
            dv var7;
            if ((var7 = this.a.a(var6)) != null) {
               var5.getWidth();
            }
         default:
         }
      } catch (IOException var3) {
      }
   }

   public static void d() {
      eg.b();
      a().a = null;
      a().a = null;
   }

   private static boolean a(int var0, Vector var1, byte var2, String var3) {
      fs var4;
      ag var5;
      if ((var4 = bc.a()) instanceof ag && (var5 = (ag)var4).a == var0) {
         var5.a(var1);
         return true;
      } else {
         (var5 = new ag()).a = var2;
         var5.a(var1);
         var5.g(var3);
         var5.a(var0);
         var5.a(1, true);
         return false;
      }
   }
}
