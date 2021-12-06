from pynput import keyboard

def on_activate_h():
    print('<ctrl>+h pressed')

def on_activate_i():
    print('<ctrl>+i pressed')

with keyboard.GlobalHotKeys({
        '<ctrl>+h': on_activate_h,
        '<ctrl>+i': on_activate_i}) as h:
    h.join()