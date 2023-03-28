# power-manager

A capacitor plugin to have power management access

## Install

```bash
npm install power-manager
npx cap sync
```

## API

<docgen-index>

* [`isIgnoringBatteryOptimizations(...)`](#isignoringbatteryoptimizations)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isIgnoringBatteryOptimizations(...)

```typescript
isIgnoringBatteryOptimizations(feature: string) => Promise<LowPowerResponse>
```

| Param         | Type                |
| ------------- | ------------------- |
| **`feature`** | <code>string</code> |

**Returns:** <code>Promise&lt;<a href="#lowpowerresponse">LowPowerResponse</a>&gt;</code>

--------------------


### Interfaces


#### LowPowerResponse

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |

</docgen-api>
