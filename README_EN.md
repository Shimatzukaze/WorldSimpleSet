# WorldSimpleSet
A lightweight world event control plugin.  
[ [中文](https://github.com/reuAC/WorldSimpleSet/blob/reuAC/README.md) | English | [日本語](https://github.com/reuAC/WorldSimpleSet/blob/reuAC/README_JP.md) ]

## Introduction
This plugin is compatible with Spigot 1.8 and above.  

It supports controlling corresponding events across the entire server.  
## Commands
`/worldsimpleset` Reload configuration.  
**Alias：`/wss`**

## Configuration File
After the plugin starts successfully, a configuration file will be generated in the plugins folder, located at `plugins/WorldSimpleSet/config.yml`  

This file contains various events, and if the value of a corresponding event is set to **true**, it will be **prevented from occurring**.  

```yaml
// Whether to prevent block breaking events
BlockBreak: false

// Whether to prevent block placing events
BlockPlace: false

// Whether to prevent block burning events
BlockBurn: false

// Whether to prevent block spreading events
BlockSpread: false

// Whether to prevent blocks from being ignited
BlockIgnite: false

// Whether to prevent plants or crops from growing
BlockGrow: false

// Whether to prevent blocks from taking damage
BlockDamage: false

// Whether to prevent blocks from naturally disappearing (e.g., ice melting)
BlockFade: false

// Whether to prevent players from dropping items
PlayerDropItem: false

// Whether to prevent players from interacting with blocks or objects in the world
PlayerInteract: false

// Whether to prevent players from interacting with entities (e.g., animals or NPCs)
PlayerInteractEntity: false

// Whether to prevent entities from taking damage from blocks
EntityDamageByBlock: false

// Whether to prevent entities from taking damage from other entities
EntityDamageByEntity: false

// Whether to prevent players from sending messages in the chat
Chat: false
```

## Permission Nodes
`worldsimpleset.main` Use the reload command.

## Usage
1. Place the compiled JAR file into the plugins folder and restart the server.
