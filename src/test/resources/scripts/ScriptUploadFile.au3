if WinExists("Open", "")Then
ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1",@ScriptDir&"\prueba.pdf")
ControlClick("Open","","Button1")
Else
ControlFocus("Abrir","","Edit1")
ControlSetText("Abrir","","Edit1",@ScriptDir&"\prueba.pdf")
ControlClick("Abrir","","Button1")
EndIf