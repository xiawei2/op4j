package com.Op4j;

import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({51E59A6F-85F4-4DA0-A01E-C9B6B3B8B8A7})</p>
 */
@ComInterface(iid="{51E59A6F-85F4-4DA0-A01E-C9B6B3B8B8A7}")
public interface IOpInterface extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Ver", dispId = 0x1)
    String Ver();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param path [in] {@code String}
     */
    @ComMethod(name = "SetPath", dispId = 0x2)
    int SetPath(String path);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "GetPath", dispId = 0x3)
    String GetPath();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "GetBasePath", dispId = 0x4)
    String GetBasePath();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "GetID", dispId = 0x5)
    int GetID();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "GetLastError", dispId = 0x6)
    int GetLastError();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param show_type [in] {@code int}
     */
    @ComMethod(name = "SetShowErrorMsg", dispId = 0x7)
    int SetShowErrorMsg(int show_type);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param millseconds [in] {@code int}
     */
    @ComMethod(name = "Sleep", dispId = 0x8)
    int Sleep(int millseconds);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param process_name [in] {@code String}
     * @param dll_name [] {@code String}
     * @param ret [] {@code int}
     */
    @ComMethod(name = "InjectDll", dispId = 0x9)
    void InjectDll(String process_name,
                   String dll_name,
                   int ret);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param enable [in] {@code int}
     */
    @ComMethod(name = "EnablePicCache", dispId = 0xa)
    int EnablePicCache(int enable);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     * @param file_name [in] {@code String}
     */
    @ComMethod(name = "CapturePre", dispId = 0xb)
    int CapturePre(String file_name);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(18)</p>
     * @param mapWidth [in] {@code int}
     * @param mapHeight [in] {@code int}
     * @param disable_points [in] {@code String}
     * @param beginX [in] {@code int}
     * @param beginY [in] {@code int}
     * @param endX [in] {@code int}
     * @param endY [in] {@code int}
     */
    @ComMethod(name = "AStarFindPath", dispId = 0x14)
    String AStarFindPath(int mapWidth,
                         int mapHeight,
                         String disable_points,
                         int beginX,
                         int beginY,
                         int endX,
                         int endY);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(19)</p>
     * @param all_pos [in] {@code String}
     * @param type [in] {@code int}
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     */
    @ComMethod(name = "FindNearestPos", dispId = 0x15)
    String FindNearestPos(String all_pos,
                          int type,
                          int x,
                          int y);
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(20)</p>
     * @param parent [in] {@code int}
     * @param title [in] {@code String}
     * @param class_name [in] {@code String}
     * @param filter [in] {@code int}
     */
    @ComMethod(name = "EnumWindow", dispId = 0x3a)
    String EnumWindow(int parent,
                      String title,
                      String class_name,
                      int filter);
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(21)</p>
     * @param process_name [in] {@code String}
     * @param title [in] {@code String}
     * @param class_name [in] {@code String}
     * @param filter [in] {@code int}
     */
    @ComMethod(name = "EnumWindowByProcess", dispId = 0x3b)
    String EnumWindowByProcess(String process_name,
                               String title,
                               String class_name,
                               int filter);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(22)</p>
     * @param name [in] {@code String}
     */
    @ComMethod(name = "EnumProcess", dispId = 0x3c)
    String EnumProcess(String name);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(23)</p>
     * @param ClientToScreen [in] {@code int}
     * @param x [inout] {@code Object}
     * @param y [inout] {@code Object}
     */
    @ComMethod(name = "ClientToScreen", dispId = 0x3d)
    int ClientToScreen(int ClientToScreen,
                           VARIANT x,
                           VARIANT y);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(24)</p>
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindow", dispId = 0x3e)
    int FindWindow(String class_name,
                       String title);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(25)</p>
     * @param process_name [in] {@code String}
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindowByProcess", dispId = 0x3f)
    int FindWindowByProcess(String process_name,
                                String class_name,
                                String title);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(26)</p>
     * @param process_id [in] {@code int}
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindowByProcessId", dispId = 0x40)
    int FindWindowByProcessId(int process_id,
                                  String class_name,
                                  String title);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(27)</p>
     * @param parent [in] {@code int}
     * @param class_name [in] {@code String}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "FindWindowEx", dispId = 0x41)
    int FindWindowEx(int parent,
                         String class_name,
                         String title);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(28)</p>
     * @param hwnd [in] {@code int}
     * @param x1 [out] {@code Object}
     * @param y1 [out] {@code Object}
     * @param x2 [out] {@code Object}
     * @param y2 [out] {@code Object}
     */
    @ComMethod(name = "GetClientRect", dispId = 0x42)
    int GetClientRect(int hwnd,
                          VARIANT x1,
                          VARIANT y1,
                          VARIANT x2,
                          VARIANT y2);
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(29)</p>
     * @param hwnd [in] {@code int}
     * @param width [out] {@code Object}
     * @param height [out] {@code Object}
     */
    @ComMethod(name = "GetClientSize", dispId = 0x43)
    int GetClientSize(int hwnd,
                          VARIANT width,
                          VARIANT height);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "GetForegroundFocus", dispId = 0x44)
    int GetForegroundFocus();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "GetForegroundWindow", dispId = 0x45)
    int GetForegroundWindow();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "GetMousePointWindow", dispId = 0x46)
    int GetMousePointWindow();
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(33)</p>
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     */
    @ComMethod(name = "GetPointWindow", dispId = 0x47)
    int GetPointWindow(int x,
                           int y);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(34)</p>
     * @param pid [in] {@code int}
     */
    @ComMethod(name = "GetProcessInfo", dispId = 0x48)
    String GetProcessInfo(int pid);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(35)</p>
     * @param flag [in] {@code int}
     */
    @ComMethod(name = "GetSpecialWindow", dispId = 0x49)
    int GetSpecialWindow(int flag);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(36)</p>
     * @param hwnd [in] {@code int}
     * @param flag [in] {@code int}
     */
    @ComMethod(name = "GetWindow", dispId = 0x4a)
    int GetWindow(int hwnd,
                      int flag);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(37)</p>
     * @param hwnd [in] {@code int}
     */
    @ComMethod(name = "GetWindowClass", dispId = 0x4b)
    String GetWindowClass(int hwnd);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(38)</p>
     * @param hwnd [in] {@code int}
     */
    @ComMethod(name = "GetWindowProcessId", dispId = 0x4c)
    int GetWindowProcessId(int hwnd);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(39)</p>
     * @param hwnd [in] {@code int}
     */
    @ComMethod(name = "GetWindowProcessPath", dispId = 0x4d)
    String GetWindowProcessPath(int hwnd);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(40)</p>
     * @param hwnd [in] {@code int}
     * @param x1 [out] {@code Object}
     * @param y1 [out] {@code Object}
     * @param x2 [out] {@code Object}
     * @param y2 [out] {@code Object}
     */
    @ComMethod(name = "GetWindowRect", dispId = 0x4e)
    int GetWindowRect(int hwnd,
                          VARIANT x1,
                          VARIANT y1,
                          VARIANT x2,
                          VARIANT y2);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(41)</p>
     * @param hwnd [in] {@code int}
     * @param flag [in] {@code int}
     */
    @ComMethod(name = "GetWindowState", dispId = 0x4f)
    int GetWindowState(int hwnd,
                           int flag);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(42)</p>
     * @param hwnd [in] {@code int}
     */
    @ComMethod(name = "GetWindowTitle", dispId = 0x50)
    String GetWindowTitle(int hwnd);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(43)</p>
     * @param hwnd [in] {@code int}
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     */
    @ComMethod(name = "MoveWindow", dispId = 0x51)
    int MoveWindow(int hwnd,
                       int x,
                       int y);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(44)</p>
     * @param hwnd [in] {@code int}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "ScreenToClient", dispId = 0x52)
    int ScreenToClient(int hwnd,
                           VARIANT x,
                           VARIANT y);
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(45)</p>
     * @param hwnd [in] {@code int}
     */
    @ComMethod(name = "SendPaste", dispId = 0x53)
    int SendPaste(int hwnd);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(46)</p>
     * @param hwnd [in] {@code int}
     * @param width [in] {@code int}
     * @param hight [in] {@code int}
     */
    @ComMethod(name = "SetClientSize", dispId = 0x54)
    int SetClientSize(int hwnd,
                          int width,
                          int hight);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(47)</p>
     * @param hwnd [in] {@code int}
     * @param flag [in] {@code int}
     */
    @ComMethod(name = "SetWindowState", dispId = 0x55)
    int SetWindowState(int hwnd,
                           int flag);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(48)</p>
     * @param hwnd [in] {@code int}
     * @param width [in] {@code int}
     * @param height [in] {@code int}
     */
    @ComMethod(name = "SetWindowSize", dispId = 0x56)
    int SetWindowSize(int hwnd,
                          int width,
                          int height);
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(49)</p>
     * @param hwnd [in] {@code int}
     * @param title [in] {@code String}
     */
    @ComMethod(name = "SetWindowText", dispId = 0x57)
    int SetWindowText(int hwnd,
                          String title);
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(50)</p>
     * @param hwnd [in] {@code int}
     * @param trans [in] {@code int}
     */
    @ComMethod(name = "SetWindowTransparent", dispId = 0x58)
    int SetWindowTransparent(int hwnd,
                                 int trans);
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(51)</p>
     * @param hwnd [in] {@code int}
     * @param str [in] {@code String}
     */
    @ComMethod(name = "SendString", dispId = 0x59)
    int SendString(int hwnd,
                       String str);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(52)</p>
     * @param hwnd [in] {@code int}
     * @param str [in] {@code String}
     */
    @ComMethod(name = "SendStringIme", dispId = 0x5a)
    int SendStringIme(int hwnd,
                          String str);
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(53)</p>
     * @param cmdline [in] {@code String}
     * @param mode [in] {@code int}
     */
    @ComMethod(name = "RunApp", dispId = 0x5b)
    int RunApp(String cmdline,
                   int mode);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(54)</p>
     * @param cmdline [in] {@code String}
     * @param cmdshow [in] {@code int}
     */
    @ComMethod(name = "WinExec", dispId = 0x5f)
    int WinExec(String cmdline,
                    int cmdshow);
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(55)</p>
     * @param cmd [in] {@code String}
     * @param millseconds [in] {@code int}
     */
    @ComMethod(name = "GetCmdStr", dispId = 0x60)
    String GetCmdStr(String cmd,
                     int millseconds);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(56)</p>
     * @param hwnd [in] {@code int}
     * @param display [in] {@code String}
     * @param mouse [in] {@code String}
     * @param keypad [in] {@code String}
     * @param mode [in] {@code int}
     */
    @ComMethod(name = "BindWindow", dispId = 0x64)
    int BindWindow(int hwnd,
                       String display,
                       String mouse,
                       String keypad,
                       int mode);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "UnBindWindow", dispId = 0x65)
    int UnBindWindow();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(58)</p>
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "GetCursorPos", dispId = 0x78)
    int GetCursorPos(VARIANT x,
                         VARIANT y);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(59)</p>
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     */
    @ComMethod(name = "MoveR", dispId = 0x79)
    int MoveR(int x,
                  int y);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(60)</p>
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     */
    @ComMethod(name = "MoveTo", dispId = 0x7a)
    int MoveTo(int x,
                   int y);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(61)</p>
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     * @param w [in] {@code int}
     * @param h [in] {@code int}
     */
    @ComMethod(name = "MoveToEx", dispId = 0x7b)
    int MoveToEx(int x,
                     int y,
                     int w,
                     int h);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "LeftClick", dispId = 0x7c)
    int LeftClick();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "LeftDoubleClick", dispId = 0x7d)
    int LeftDoubleClick();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "LeftDown", dispId = 0x7e)
    int LeftDown();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "LeftUp", dispId = 0x7f)
    int LeftUp();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "MiddleClick", dispId = 0x80)
    int MiddleClick();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "MiddleDown", dispId = 0x81)
    int MiddleDown();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "MiddleUp", dispId = 0x82)
    int MiddleUp();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "RightClick", dispId = 0x83)
    int RightClick();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "RightDown", dispId = 0x84)
    int RightDown();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "RightUp", dispId = 0x85)
    int RightUp();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(72)</p>
     */
    @ComMethod(name = "WheelDown", dispId = 0x86)
    int WheelDown();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "WheelUp", dispId = 0x87)
    int WheelUp();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(74)</p>
     * @param vk_code [in] {@code int}
     */
    @ComMethod(name = "GetKeyState", dispId = 0x88)
    int GetKeyState(int vk_code);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(75)</p>
     * @param vk_code [in] {@code int}
     */
    @ComMethod(name = "KeyDown", dispId = 0x89)
    int KeyDown(int vk_code);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(76)</p>
     * @param vk_code [in] {@code String}
     */
    @ComMethod(name = "KeyDownChar", dispId = 0x8a)
    int KeyDownChar(String vk_code);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(77)</p>
     * @param vk_code [in] {@code int}
     */
    @ComMethod(name = "KeyUp", dispId = 0x8b)
    int KeyUp(int vk_code);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(78)</p>
     * @param vk_code [in] {@code String}
     */
    @ComMethod(name = "KeyUpChar", dispId = 0x8c)
    int KeyUpChar(String vk_code);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(79)</p>
     * @param vk_code [in] {@code int}
     * @param time_out [in] {@code int}
     */
    @ComMethod(name = "WaitKey", dispId = 0x8d)
    int WaitKey(int vk_code,
                    int time_out);
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(80)</p>
     * @param vk_code [in] {@code int}
     */
    @ComMethod(name = "KeyPress", dispId = 0x8e)
    int KeyPress(int vk_code);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(81)</p>
     * @param vk_code [in] {@code String}
     */
    @ComMethod(name = "KeyPressChar", dispId = 0x8f)
    int KeyPressChar(String vk_code);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(82)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param file_name [in] {@code String}
     */
    @ComMethod(name = "Capture", dispId = 0x96)
    int Capture(int x1,
                    int y1,
                    int x2,
                    int y2,
                    String file_name);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(83)</p>
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "CmpColor", dispId = 0x97)
    int CmpColor(int x,
                     int y,
                     String color,
                     Double sim);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(84)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindColor", dispId = 0x98)
    int FindColor(int x1,
                      int y1,
                      int x2,
                      int y2,
                      String color,
                      Double sim,
                      int dir,
                      VARIANT x,
                      VARIANT y);
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(85)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     */
    @ComMethod(name = "FindColorEx", dispId = 0x99)
    String FindColorEx(int x1,
                       int y1,
                       int x2,
                       int y2,
                       String color,
                       Double sim,
                       int dir);
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(86)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param first_color [in] {@code String}
     * @param offset_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindMultiColor", dispId = 0x9a)
    int FindMultiColor(int x1,
                           int y1,
                           int x2,
                           int y2,
                           String first_color,
                           String offset_color,
                           Double sim,
                           int dir,
                           VARIANT x,
                           VARIANT y);
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(87)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param first_color [in] {@code String}
     * @param offset_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     */
    @ComMethod(name = "FindMultiColorEx", dispId = 0x9b)
    String FindMultiColorEx(int x1,
                            int y1,
                            int x2,
                            int y2,
                            String first_color,
                            String offset_color,
                            Double sim,
                            int dir);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(88)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param files [in] {@code String}
     * @param delta_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindPic", dispId = 0x9c)
    int FindPic(int x1,
                    int y1,
                    int x2,
                    int y2,
                    String files,
                    String delta_color,
                    Double sim,
                    int dir,
                    VARIANT x,
                    VARIANT y);
            
    /**
     * <p>id(0x9d)</p>
     * <p>vtableId(89)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param files [in] {@code String}
     * @param delta_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     */
    @ComMethod(name = "FindPicEx", dispId = 0x9d)
    String FindPicEx(int x1,
                     int y1,
                     int x2,
                     int y2,
                     String files,
                     String delta_color,
                     Double sim,
                     int dir);
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(90)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param files [in] {@code String}
     * @param delta_color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param dir [in] {@code int}
     */
    @ComMethod(name = "FindPicExS", dispId = 0x9e)
    String FindPicExS(int x1,
                      int y1,
                      int x2,
                      int y2,
                      String files,
                      String delta_color,
                      Double sim,
                      int dir);
            
    /**
     * <p>id(0x9f)</p>
     * <p>vtableId(91)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param count [in] {@code int}
     * @param height [in] {@code int}
     * @param width [in] {@code int}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "FindColorBlock", dispId = 0x9f)
    int FindColorBlock(int x1,
                           int y1,
                           int x2,
                           int y2,
                           String color,
                           Double sim,
                           int count,
                           int height,
                           int width,
                           VARIANT x,
                           VARIANT y);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(92)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param count [in] {@code int}
     * @param height [in] {@code int}
     * @param width [in] {@code int}
     */
    @ComMethod(name = "FindColorBlockEx", dispId = 0xa0)
    String FindColorBlockEx(int x1,
                            int y1,
                            int x2,
                            int y2,
                            String color,
                            Double sim,
                            int count,
                            int height,
                            int width);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(93)</p>
     * @param str [in] {@code String}
     */
    @ComMethod(name = "GetResultCount", dispId = 0xa1)
    int GetResultCount(String str);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(94)</p>
     * @param str [in] {@code String}
     * @param index [in] {@code int}
     * @param x [out] {@code Object}
     * @param y [out] {@code Object}
     */
    @ComMethod(name = "GetResultPos", dispId = 0xa2)
    int GetResultPos(String str,
                         int index,
                         VARIANT x,
                         VARIANT y);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(95)</p>
     * @param x [in] {@code int}
     * @param y [in] {@code int}
     */
    @ComMethod(name = "GetColor", dispId = 0xa3)
    String GetColor(int x,
                    int y);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(96)</p>
     * @param method [in] {@code String}
     */
    @ComMethod(name = "SetDisplayInput", dispId = 0xa4)
    int SetDisplayInput(String method);
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(97)</p>
     * @param pic_name [in] {@code String}
     */
    @ComMethod(name = "LoadPic", dispId = 0xa5)
    int LoadPic(String pic_name);
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(98)</p>
     * @param pic_name [in] {@code String}
     */
    @ComMethod(name = "FreePic", dispId = 0xa6)
    int FreePic(String pic_name);
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(99)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     */
    @ComMethod(name = "GetScreenData", dispId = 0xa7)
    int GetScreenData(int x1,
                          int y1,
                          int x2,
                          int y2);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(100)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param data [out] {@code Object}
     * @param size [out] {@code Object}
     */
    @ComMethod(name = "GetScreenDataBmp", dispId = 0xa8)
    int GetScreenDataBmp(int x1,
                             int y1,
                             int x2,
                             int y2,
                             VARIANT data,
                             VARIANT size);
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(101)</p>
     * @param pic_name [in] {@code String}
     */
    @ComMethod(name = "MatchPicName", dispId = 0xa9)
    String MatchPicName(String pic_name);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(102)</p>
     * @param pic_name [in] {@code String}
     * @param data [in] {@code Long}
     * @param size [in] {@code int}
     */
    @ComMethod(name = "LoadMemPic", dispId = 0xaa)
    int LoadMemPic(String pic_name,
                       Long data,
                       int size);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(103)</p>
     * @param idx [in] {@code int}
     * @param file_name [in] {@code String}
     */
    @ComMethod(name = "SetDict", dispId = 0xc8)
    int SetDict(int idx,
                    String file_name);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(104)</p>
     * @param idx [in] {@code int}
     */
    @ComMethod(name = "UseDict", dispId = 0xc9)
    int UseDict(int idx);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(105)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "Ocr", dispId = 0xca)
    String Ocr(int x1,
               int y1,
               int x2,
               int y2,
               String color,
               Double sim);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(106)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrEx", dispId = 0xcb)
    String OcrEx(int x1,
                 int y1,
                 int x2,
                 int y2,
                 String color,
                 Double sim);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(107)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param str [in] {@code String}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     * @param retx [out] {@code Object}
     * @param rety [out] {@code Object}
     */
    @ComMethod(name = "FindStr", dispId = 0xcc)
    int FindStr(int x1,
                    int y1,
                    int x2,
                    int y2,
                    String str,
                    String color,
                    Double sim,
                    VARIANT retx,
                    VARIANT rety);
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(108)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param str [in] {@code String}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "FindStrEx", dispId = 0xcd)
    String FindStrEx(int x1,
                     int y1,
                     int x2,
                     int y2,
                     String str,
                     String color,
                     Double sim);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(109)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrAuto", dispId = 0xce)
    String OcrAuto(int x1,
                   int y1,
                   int x2,
                   int y2,
                   Double sim);
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(110)</p>
     * @param file_name [in] {@code String}
     * @param color_format [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrFromFile", dispId = 0xcf)
    String OcrFromFile(String file_name,
                       String color_format,
                       Double sim);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(111)</p>
     * @param file_name [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "OcrAutoFromFile", dispId = 0xd0)
    String OcrAutoFromFile(String file_name,
                           Double sim);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(112)</p>
     * @param x1 [in] {@code int}
     * @param y1 [in] {@code int}
     * @param x2 [in] {@code int}
     * @param y2 [in] {@code int}
     * @param color [in] {@code String}
     * @param sim [in] {@code Double}
     */
    @ComMethod(name = "FindLine", dispId = 0xd1)
    String FindLine(int x1,
                    int y1,
                    int x2,
                    int y2,
                    String color,
                    Double sim);
            
    /**
     * <p>id(0xdc)</p>
     * <p>vtableId(113)</p>
     * @param idx [in] {@code int}
     * @param data [in] {@code String}
     * @param size [in] {@code int}
     */
    @ComMethod(name = "SetMemDict", dispId = 0xdc)
    int SetMemDict(int idx,
                       String data,
                       int size);
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(114)</p>
     * @param hwnd [in] {@code int}
     * @param address [in] {@code String}
     * @param data [in] {@code String}
     * @param size [in] {@code int}
     */
    @ComMethod(name = "WriteData", dispId = 0xfa)
    int WriteData(int hwnd,
                      String address,
                      String data,
                      int size);
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(115)</p>
     * @param hwnd [in] {@code int}
     * @param address [in] {@code String}
     * @param size [in] {@code int}
     */
    @ComMethod(name = "ReadData", dispId = 0xfb)
    String ReadData(int hwnd,
                    String address,
                    int size);



            
    
}