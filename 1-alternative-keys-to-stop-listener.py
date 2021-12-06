from pynput import keyboard

# The event listener will be running in this block
with keyboard.Events() as events:
    for event in events:
        if event.key == keyboard.Key.ctrl_l:
            break
        else:
            print('Received event {}'.format(event))