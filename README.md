# WorldSimpleSet
轻量的世界事件控制插件。  
[ 中文 | [English](https://github.com/reuAC/WorldSimpleSet/blob/reuAC/README_EN.md) | [日本語](https://github.com/reuAC/WorldSimpleSet/blob/reuAC/README_JP.md) ]

## 介绍
该插件适用于Spigot1.8及以上。  

支持控制整个服务器范围内的对应事件。
## 指令
`/worldsimpleset` 重载配置。  
**缩写：`/wss`**

## 配置文件
插件成功启动后，会在plugins文件夹下生成配置文件，位于 `plugins/WorldSimpleSet/config.yml`  

其中包含各个事件，若对应事件的值为**true**，则会被**阻止发生**。

```yaml
// 是否阻止破坏方块的事件
BlockBreak: false

// 是否阻止放置方块的事件
BlockPlace: false

// 是否阻止方块燃烧的事件
BlockBurn: false

// 是否阻止方块自然传播的事件
BlockSpread: false

// 是否阻止方块被点燃的事件
BlockIgnite: false

// 是否阻止植物或作物生长的事件
BlockGrow: false

// 是否阻止方块受到伤害的事件
BlockDamage: false

// 是否阻止方块自然消失（如冰块融化）的事件
BlockFade: false

// 是否阻止玩家丢弃物品的事件
PlayerDropItem: false

// 是否阻止玩家与世界中的方块或物体互动的事件
PlayerInteract: false

// 是否阻止玩家与实体（如动物或NPC）互动的事件
PlayerInteractEntity: false

// 是否阻止实体受到来自方块的伤害的事件
EntityDamageByBlock: false

// 是否阻止实体受到来自其他实体的伤害的事件
EntityDamageByEntity: false

// 是否阻止玩家在聊天框发送消息的事件
Chat: false

```

## 权限节点
`worldsimpleset.main` 使用重载指令。

## 使用方法
1. 将编译完成的jar包放入plugins文件夹中，重启服务器。