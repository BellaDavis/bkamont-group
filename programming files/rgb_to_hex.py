def rgb_to_hex(r, g, b):
    #red variable
    r = max(0, min(255, r))
    #green variable
    g = max(0, min(255, g))
    #blue variable
    b = max(0, min(255, b))
    
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
