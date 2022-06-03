info("Copyright © 2022 Team CSS. All right reserved.")

mainMenu {
    enabled = true
    splashText {
        enabled = true
        splashesEnabled = false
    }
    background {
        clearBackgrounds()
        backgroundStayLength = 1
        backgroundFadeLength = 1
        renderGradientShade = false
        image { texture = file("config/modpack/menu/background.png") }
    }
    removeMinecraftLogo()
    removeEditionBadge()
    clearAllButtons()
    button {
        position {
            x { it / 2 - 101 }
            y = 129
        }
        width = 204
        height = 20
        text = translatable("menu.singleplayer")
        onClicked = singleplayer()
    }
    button {
        position {
            x { it / 2 - 101 }
            y = 151
        }
        width = 204
        height = 20
        text = translatable("menu.multiplayer")
        onClicked = multiplayer()
    }
    button {
        position {
            x { it / 2 + 3 }
            y = 174
        }
        width = 100
        height = 20
        text = literal("Source")
        onClicked = url("https://github.com/ModsforModpacks/Vanillavibe/tree/1.18.x")
    }
    button {
        position {
            x { it / 2 - 101 }
            y = 174
        }
        width = 100
        height = 20
        text = literal("Wikipedia")
        onClicked = url("https://github.com/ModsforModpacks/Vanillavibe/wiki")
    }
    button {
        position {
            x { it / 2 - 101 }
            y = 197
        }
        width = 100
        height = 20
        text = literal("Languages")
        onClicked = language()
    }
    button {
        position {
            x { it / 2 + 3 }
            y = 197
        }
        width = 100
        height = 20
        text = literal("Mods")
        onClicked = modMenu()
    }
    button {
        position {
            x { it / 2 - 101 }
            y = 220
        }
        width = 100
        height = 20
        text = translatable("menu.options")
        onClicked = options()
    }
    button {
        position {
            x { it / 2 + 3 }
            y = 220
        }
        width = 100
        height = 20
        text = translatable("menu.quit")
        onClicked = exit()
    }
}