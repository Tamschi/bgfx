$input v_normal, v_view, v_shadowcoord

/*
 * Copyright 2013-2014 Dario Manesku. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#define SM_ESM 1
#define SM_LINEAR 1

#include "fs_shadowmaps_color_lighting.sh"

void main()
{
#include "fs_shadowmaps_color_lighting_main.sh"
}
