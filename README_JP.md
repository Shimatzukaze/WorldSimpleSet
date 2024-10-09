# WorldSimpleSet
軽量なワールドイベントコントロールプラグイン。  
[ [中文](https://github.com/reuAC/WorldSimpleSet/blob/reuAC/README_EN.md) | [English](https://github.com/reuAC/WorldSimpleSet/blob/reuAC/README_EN.md) | 日本語 ]

## 紹介
このプラグインはSpigot 1.8以上に対応しています。  

サーバー全体の該当イベントを制御することができます。
## コマンド
`/worldsimpleset` 設定を再読み込みする。  
**設定再読：`/wss`**

## 設定ファイル
プラグインが正常に起動すると、 `plugins/WorldSimpleSet/config.yml` に設定ファイルが生成されます。  

その中には各イベントが含まれており、該当イベントの値が**true**であれば、**発生を防止**します。  

```yaml
// ブロック破壊イベントを防止するかどうか
BlockBreak: false

// ブロック設置イベントを防止するかどうか
BlockPlace: false

// ブロック燃焼イベントを防止するかどうか
BlockBurn: false

// ブロック自然拡散イベントを防止するかどうか
BlockSpread: false

// ブロック点火イベントを防止するかどうか
BlockIgnite: false

// 植物または作物成長イベントを防止するかどうか
BlockGrow: false

// ブロックへのダメージイベントを防止するかどうか
BlockDamage: false

// ブロックの自然消失（氷が溶けるなど）イベントを防止するかどうか
BlockFade: false

// プレイヤーがアイテムを捨てるイベントを防止するかどうか
PlayerDropItem: false

// プレイヤーが世界のブロックやオブジェクトと相互作用するイベントを防止するかどうか
PlayerInteract: false

// プレイヤーがエンティティ（動物やNPCなど）と相互作用するイベントを防止するかどうか
PlayerInteractEntity: false

// エンティティがブロックからのダメージを受けるイベントを防止するかどうか
EntityDamageByBlock: false

// エンティティが他のエンティティからのダメージを受けるイベントを防止するかどうか
EntityDamageByEntity: false

// プレイヤーがチャットボックスにメッセージを送信するイベントを防止するかどうか
Chat: false

```

## 権限ノード
`worldsimpleset.main` は再読み込みコマンドを使用します。

## 使用方法
1. コンパイルが完了したJARファイルをpluginsフォルダに置き、サーバーを再起動します。